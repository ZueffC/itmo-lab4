package itmo.lab4.interfaces;

import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.models.transport.BaseTransport;

public interface Damageable {
    public void affectTransport(BaseTransport transport) throws ShipDestroyedException;
}