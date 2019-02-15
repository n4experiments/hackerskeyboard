package org.nift4.pluginkeyboard;
import android.content.Context;
import android.app.AlertDialog;

public interface PluginKeyboardAPI
{
	public void fixDialog(AlertDialog d);
	public Context getCtx();
}
