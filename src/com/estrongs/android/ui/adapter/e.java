package com.estrongs.android.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.estrongs.android.pop.FexApplication;
import com.estrongs.android.pop.esclasses.k;
import com.estrongs.android.pop.view.FileExplorerActivity;
import com.estrongs.android.pop.view.utils.ac;
import com.estrongs.android.pop.view.utils.ad;
import com.estrongs.android.ui.d.g;
import com.estrongs.android.ui.theme.at;
import com.estrongs.android.view.cr;

public class e
  extends BaseAdapter
{
  private Context a;
  private int b = 8;
  private Drawable[] c;
  private at d;
  private int e;
  
  public e(Context paramContext)
  {
    a = paramContext;
    d = at.a(a);
    c = new Drawable[getCount()];
    c[0] = d.a(2130838610);
    c[1] = d.a(2130838616);
    c[2] = d.a(2130838612);
    c[3] = d.a(2130838614);
    c[4] = d.a(2130838611);
    c[5] = d.a(2130838617);
    c[6] = d.a(2130838613);
    c[7] = d.a(2130838615);
    if (FileExplorerActivity.X() != null) {}
    for (paramContext = FileExplorerActivity.X().O();; paramContext = null)
    {
      if (paramContext != null)
      {
        int j = paramContext.ad();
        int i = paramContext.ac();
        if (ac.c(paramContext.c()))
        {
          paramContext = ac.a(FexApplication.a(), paramContext.c());
          j = d;
          i = c;
        }
        e = (i + j * 4);
        return;
      }
      e = -1;
      return;
    }
  }
  
  public void a(int paramInt)
  {
    e = paramInt;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return b;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = k.a(a).inflate(2130903283, null);
    }
    paramView = (ImageView)paramViewGroup.findViewById(2131624054);
    paramView.setImageDrawable(c[paramInt]);
    paramView.setPadding(0, g.a(a, 6.0F), 0, g.a(a, 6.0F));
    ((TextView)paramViewGroup.findViewById(2131624537)).setVisibility(8);
    if (paramInt == e)
    {
      paramViewGroup.setBackgroundResource(2130838298);
      return paramViewGroup;
    }
    paramViewGroup.setBackgroundResource(2130838302);
    return paramViewGroup;
  }
}

/* Location:
 * Qualified Name:     com.estrongs.android.ui.adapter.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */