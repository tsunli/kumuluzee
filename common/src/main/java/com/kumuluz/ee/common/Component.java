package com.kumuluz.ee.common;

/**
 * @author Tilen
 */
public interface Component {

    void init(KumuluzServer server);

    void load();

    String getComponentName();

    String getImplementationName();
}
