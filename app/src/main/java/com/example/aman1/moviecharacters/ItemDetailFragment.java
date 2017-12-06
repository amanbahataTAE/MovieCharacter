package com.example.aman1.moviecharacters;

import android.app.Activity;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_NAME = "item_name";
    public static final String ARG_ITEM_TEXT = "item_text";
    public static final String ARG_ITEM_ICON = "item_icon";



    /**
     * The dummy content this fragment is presenting.
     */
    private String mItemName;
    private String mItemText;
    private String mItemIcon;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_NAME)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItemName = getArguments().getString(ARG_ITEM_NAME);
            mItemText = getArguments().getString(ARG_ITEM_TEXT);
            mItemIcon = getArguments().getString(ARG_ITEM_ICON);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItemName);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItemName != null) {
            ((TextView) rootView.findViewById(R.id.item_detail_text)).setText(mItemText);

            Uri uri = Uri.parse(mItemIcon);
            SimpleDraweeView draweeView = (SimpleDraweeView) rootView.findViewById(R.id.my_image_view);
            if (!mItemIcon.isEmpty() && mItemIcon != "") {
                draweeView.setImageURI(uri);
            }else {
                TextView imageAnavailable = (TextView) rootView.findViewById(R.id.item_detail_not_available);
                imageAnavailable.setVisibility(View.VISIBLE);
            }
        }

        return rootView;
    }
}
