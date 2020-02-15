package com.example.admin.broadcastbesttest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2019/8/2.
 */

public class ActivityCllocter {
   private static List<Activity>listactivity=new ArrayList<>();
    public static void add(Activity activity)
    {
        listactivity.add(activity);
    }
    public static void remove(Activity activity){
        listactivity.remove(activity);
    }
    public static void finishall()
    {
        for (Activity activity:listactivity)
        {
            if (!activity.isFinishing())
            activity.finish();
        }
    }
}
