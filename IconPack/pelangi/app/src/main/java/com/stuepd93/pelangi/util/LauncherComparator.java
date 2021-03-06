package com.stuepd93.pelangi.util;

import java.util.Comparator;
import com.stuepd93.pelangi.item.*;

public class LauncherComparator implements Comparator<LauncherListItem> {

    @Override
    public int compare(LauncherListItem o1, LauncherListItem o2) {
        int obj1 = o1.isInstalled() ? 1 : 0;
        int obj2 = o2.isInstalled() ? 1 : 0;
        return obj2 - obj1;
    }

}
