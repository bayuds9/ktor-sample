// Generated by view binder compiler. Do not edit!
package com.flowerencee9.marketplace.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.flowerencee9.marketplace.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutItemLatestProductBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imgProduct;

  @NonNull
  public final TextView tvProductName;

  @NonNull
  public final TextView tvSellerName;

  private LayoutItemLatestProductBinding(@NonNull CardView rootView, @NonNull ImageView imgProduct,
      @NonNull TextView tvProductName, @NonNull TextView tvSellerName) {
    this.rootView = rootView;
    this.imgProduct = imgProduct;
    this.tvProductName = tvProductName;
    this.tvSellerName = tvSellerName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutItemLatestProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutItemLatestProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_item_latest_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutItemLatestProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgProduct;
      ImageView imgProduct = ViewBindings.findChildViewById(rootView, id);
      if (imgProduct == null) {
        break missingId;
      }

      id = R.id.tvProductName;
      TextView tvProductName = ViewBindings.findChildViewById(rootView, id);
      if (tvProductName == null) {
        break missingId;
      }

      id = R.id.tvSellerName;
      TextView tvSellerName = ViewBindings.findChildViewById(rootView, id);
      if (tvSellerName == null) {
        break missingId;
      }

      return new LayoutItemLatestProductBinding((CardView) rootView, imgProduct, tvProductName,
          tvSellerName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
