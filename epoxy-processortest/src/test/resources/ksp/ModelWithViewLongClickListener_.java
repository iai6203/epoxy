package com.airbnb.epoxy;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * Generated file. Do not modify!
 */
public class ModelWithViewLongClickListener_ extends ModelWithViewLongClickListener implements GeneratedModel<Object>, ModelWithViewLongClickListenerBuilder {
  private OnModelBoundListener<ModelWithViewLongClickListener_, Object> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<ModelWithViewLongClickListener_, Object> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<ModelWithViewLongClickListener_, Object> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<ModelWithViewLongClickListener_, Object> onModelVisibilityChangedListener_epoxyGeneratedModel;

  public ModelWithViewLongClickListener_() {
    super();
  }

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final Object object, final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void handlePostBind(final Object object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public ModelWithViewLongClickListener_ onBind(
      OnModelBoundListener<ModelWithViewLongClickListener_, Object> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(Object object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public ModelWithViewLongClickListener_ onUnbind(
      OnModelUnboundListener<ModelWithViewLongClickListener_, Object> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final Object object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public ModelWithViewLongClickListener_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ModelWithViewLongClickListener_, Object> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final Object object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public ModelWithViewLongClickListener_ onVisibilityChanged(
      OnModelVisibilityChangedListener<ModelWithViewLongClickListener_, Object> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set
   */
  public ModelWithViewLongClickListener_ clickListener(
      final OnModelLongClickListener<ModelWithViewLongClickListener_, Object> clickListener) {
    onMutation();
    if (clickListener == null) {
      super.clickListener = null;
    }
    else {
      super.clickListener = new WrappedEpoxyModelClickListener<>(clickListener);
    }
    return this;
  }

  public ModelWithViewLongClickListener_ clickListener(View.OnLongClickListener clickListener) {
    onMutation();
    super.clickListener = clickListener;
    return this;
  }

  public View.OnLongClickListener clickListener() {
    return clickListener;
  }

  @Override
  public ModelWithViewLongClickListener_ id(long p0) {
    super.id(p0);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ id(@Nullable Number... p0) {
    super.id(p0);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ id(long p0, long p1) {
    super.id(p0, p1);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ id(@Nullable CharSequence p0) {
    super.id(p0);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ id(@Nullable CharSequence p0,
      @Nullable CharSequence... p1) {
    super.id(p0, p1);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ id(@Nullable CharSequence p0, long p1) {
    super.id(p0, p1);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ layout(@LayoutRes int p0) {
    super.layout(p0);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback p0) {
    super.spanSizeOverride(p0);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ show() {
    super.show();
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ show(boolean p0) {
    super.show(p0);
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ hide() {
    super.hide();
    return this;
  }

  @Override
  public ModelWithViewLongClickListener_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    super.clickListener = null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ModelWithViewLongClickListener_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ModelWithViewLongClickListener_ that = (ModelWithViewLongClickListener_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((clickListener == null) != (that.clickListener == null))) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int _result = super.hashCode();
    _result = 31 * _result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (clickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "ModelWithViewLongClickListener_{" +
        "clickListener=" + clickListener +
        "}" + super.toString();
  }
}
