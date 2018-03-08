package org.bluez;

import org.freedesktop.dbus.interfaces.DBusInterface;

/**
 * File generated - 2018-03-08.
 * Based on bluez Documentation: media-api.txt.
 * 
 * Service: org.bluez
 * Interface: org.bluez.MediaControl1
 * 
 * Object path: 
 *             [variable prefix]/{hci0,hci1,...}/dev_XX_XX_XX_XX_XX_XX
 * 
 * Supported properties: 
 * 
 * 	
 * 
 * 		boolean Connected [readonly]
 * 
 * 		object Player [readonly, optional]
 * 
 * 			Addressed Player object path.
 * 
 * 
 * 
 */
public interface MediaControl1 extends DBusInterface {

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Resume playback.<br>
     * <br>
     */
    @Deprecated
    void Play();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Pause playback.<br>
     * <br>
     */
    @Deprecated
    void Pause();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Stop playback.<br>
     * <br>
     */
    @Deprecated
    void Stop();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Next item.<br>
     * <br>
     */
    @Deprecated
    void Next();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Previous item.<br>
     * <br>
     */
    @Deprecated
    void Previous();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Adjust remote volume one step up<br>
     * <br>
     */
    @Deprecated
    void VolumeUp();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Adjust remote volume one step down<br>
     * <br>
     */
    @Deprecated
    void VolumeDown();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Fast forward playback, this action is only stopped<br>
     * when another method in this interface is called.<br>
     * <br>
     */
    @Deprecated
    void FastForward();

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Rewind playback, this action is only stopped<br>
     * when another method in this interface is called.<br>
     * <br>
     */
    @Deprecated
    void Rewind();

}