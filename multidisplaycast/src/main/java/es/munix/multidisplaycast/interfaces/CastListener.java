package es.munix.multidisplaycast.interfaces;

/**
 * Created by munix on 1/11/16.
 */

public interface CastListener {

    void isConnected();

    void isDisconnected();

    void onPlayStart();

    void onPlayStop();
}