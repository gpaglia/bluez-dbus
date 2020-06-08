package org.bluez.obex;

import org.freedesktop.dbus.interfaces.DBusInterface;
import java.util.Map;
import org.bluez.exceptions.BluezFailedException;
import org.bluez.exceptions.BluezInvalidArgumentsException;
import org.bluez.exceptions.BluezNotAuthorizedException;
import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.types.Variant;

/**
 * File generated - 2020-02-12.<br>
 * Based on bluez Documentation: obex-api.txt.<br>
 * <br>
 * <b>Service:</b> org.bluez.obex<br>
 * <b>Interface:</b> org.bluez.obex.Client1<br>
 * <br>
 * <b>Object path:</b><br>
 * /org/bluez/obex<br>
 * <br>
 */
public interface Client1 extends DBusInterface {

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Create a new OBEX session for the given remote address.<br>
     * <br>
     * The last parameter is a dictionary to hold optional or<br>
     * type-specific parameters. Typical parameters that can<br>
     * be set in this dictionary include the following:<br>
     * <br>
     * string "Target" : type of session to be created<br>
     * string "Source" : local address to be used<br>
     * byte "Channel"<br>
     * <br>
     * The currently supported targets are the following:<br>
     * <br>
     * "ftp"<br>
     * "map"<br>
     * "opp"<br>
     * "pbap"<br>
     * "sync"<br>
     * <br>
     *
     * @param _destination the destination
     * @param _args        the args
     * @return the d bus path
     * @throws BluezInvalidArgumentsException when argument is invalid
     * @throws BluezFailedException           on failure
     */
    DBusPath CreateSession(String _destination, Map<String, Variant<?>> _args) throws BluezInvalidArgumentsException, BluezFailedException;

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Unregister session and abort pending transfers.<br>
     * <br>
     *
     * @param _session the session
     * @throws BluezInvalidArgumentsException when argument is invalid
     * @throws BluezNotAuthorizedException    when not authorized
     */
    void RemoveSession(DBusPath _session) throws BluezInvalidArgumentsException, BluezNotAuthorizedException;

}
