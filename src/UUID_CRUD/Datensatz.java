package UUID_CRUD;

import java.util.UUID;

public abstract class Datensatz {

    private final UUID uuid;

    public Datensatz() {
        this.uuid = UUID.randomUUID();
    }

    public Datensatz(UUID id) {
        this.uuid = id;
    }

    public UUID getUuid() {
        return uuid;
    }

}
