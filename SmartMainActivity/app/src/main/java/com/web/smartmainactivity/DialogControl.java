package com.web.smartmainactivity;

import android.app.ProgressDialog;

public interface DialogControl {

	public abstract void hideWaitDialog();

	public abstract ProgressDialog showWaitDialog();

	public abstract ProgressDialog showWaitDialog(int resid);

	public abstract ProgressDialog showWaitDialog(String text);
}
