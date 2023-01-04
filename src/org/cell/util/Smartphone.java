package org.cell.util;

import org.cell.util.features.InternetNavigator;
import org.cell.util.features.Player;
import org.cell.util.features.Telephone;

public interface Smartphone extends InternetNavigator, Player, Telephone {
    void setName(String name);
    String getName();
}
