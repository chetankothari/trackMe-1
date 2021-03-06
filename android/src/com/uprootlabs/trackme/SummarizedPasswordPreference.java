package com.uprootlabs.trackme;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

final class SummarizedPasswordPreference extends EditTextPreference {

  private final String summary;

  public SummarizedPasswordPreference(final Context context) {
    super(context);
    summary = getSummary().toString();
  }

  public SummarizedPasswordPreference(final Context context, final AttributeSet attrs) {
    super(context, attrs);
    summary = getSummary().toString();
  }

  public SummarizedPasswordPreference(final Context context, final AttributeSet attrs, final int defStyle) {
    super(context, attrs, defStyle);
    summary = getSummary().toString();
  }

  public void setText(final String text) {
    super.setText(text);
    if (text.length() > 0)
      setSummary(text.replaceAll(".", "*"));
    else
      setSummary(summary);
  }

}
