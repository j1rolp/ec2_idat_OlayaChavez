// Generated by view binder compiler. Do not edit!
package com.example.ec2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ec2.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFotoMapaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAddPhoto;

  @NonNull
  public final Button btnMapa;

  @NonNull
  public final ImageView imgPhoto;

  @NonNull
  public final TextInputLayout tilCouponTitle;

  private ActivityFotoMapaBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnAddPhoto,
      @NonNull Button btnMapa, @NonNull ImageView imgPhoto,
      @NonNull TextInputLayout tilCouponTitle) {
    this.rootView = rootView;
    this.btnAddPhoto = btnAddPhoto;
    this.btnMapa = btnMapa;
    this.imgPhoto = imgPhoto;
    this.tilCouponTitle = tilCouponTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFotoMapaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFotoMapaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_foto_mapa, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFotoMapaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_photo;
      Button btnAddPhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnAddPhoto == null) {
        break missingId;
      }

      id = R.id.btn_mapa;
      Button btnMapa = ViewBindings.findChildViewById(rootView, id);
      if (btnMapa == null) {
        break missingId;
      }

      id = R.id.img_photo;
      ImageView imgPhoto = ViewBindings.findChildViewById(rootView, id);
      if (imgPhoto == null) {
        break missingId;
      }

      id = R.id.til_coupon_title;
      TextInputLayout tilCouponTitle = ViewBindings.findChildViewById(rootView, id);
      if (tilCouponTitle == null) {
        break missingId;
      }

      return new ActivityFotoMapaBinding((ConstraintLayout) rootView, btnAddPhoto, btnMapa,
          imgPhoto, tilCouponTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
