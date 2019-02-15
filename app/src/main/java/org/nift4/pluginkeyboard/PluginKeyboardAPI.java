package org.nift4.pluginkeyboard;
import android.content.Context;
import android.app.AlertDialog;

public class PluginKeyboardAPI
{
	public static interface Api {
		public void fixDialog(AlertDialog d);
		public Context getCtx();
	}
	public static interface Plugin {
		public void onBtnClick(PluginKeyboardAPI.Api api, String name);
	}
}
