package org.bluez.obex;

import org.freedesktop.dbus.interfaces.DBusInterface;
import org.bluez.exceptions.BluezAlreadyExistsException;
import org.bluez.exceptions.BluezDoesNotExistException;

/**
 * File generated - 2018-03-08.
 * Based on bluez Documentation: obex-agent-api.txt.
 * 
 * Service: org.bluez.obex
 * Interface: org.bluez.obex.AgentManager1
 * 
 * Object path: 
 *             /org/bluez/obex
 * 
 */
public interface AgentManager1 extends DBusInterface {

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * Register an agent to request authorization of<br>
     * the user to accept/reject objects. Object push<br>
     * service needs to authorize each received object.<br>
     * <br>
     * 
     * @param _agent
     * 
     * @throws BluezAlreadyExistsException
     */
    void RegisterAgent(Object _agent) throws BluezAlreadyExistsException;

    /**
     * <b>From bluez documentation:</b><br>
     * <br>
     * This unregisters the agent that has been previously<br>
     * registered. The object path parameter must match the<br>
     * same value that has been used on registration.<br>
     * <br>
     * 
     * @param _agent
     * 
     * @throws BluezDoesNotExistException
     */
    void UnregisterAgent(Object _agent) throws BluezDoesNotExistException;

}