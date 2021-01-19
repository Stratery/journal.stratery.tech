package tech.stratery.framework.core.data;

import java.io.Serializable;
import java.util.List;

public interface DataService<DataObject, ID extends Serializable> {

    /* Create Methods */
    DataObject create(DataObject dataObject);

    /* Read Methods */
    List<DataObject> get();
    DataObject get(ID id);

    /* Update Methods */
    DataObject update(DataObject dataObject);

    /* Delete Methods */
    void delete(ID id);
}
