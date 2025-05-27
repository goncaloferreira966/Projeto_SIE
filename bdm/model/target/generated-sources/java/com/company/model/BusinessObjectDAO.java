
package com.company.model;

import java.util.List;

public interface BusinessObjectDAO
    extends org.bonitasoft.engine.bdm.dao.BusinessObjectDAO
{


    public BusinessObject findByPersistenceId(Long persistenceId);

    public List<BusinessObject> findByEncomendaConforme(Boolean encomendaConforme, int startIndex, int maxResults);

    public List<BusinessObject> find(int startIndex, int maxResults);

    public Long countForFindByEncomendaConforme(Boolean encomendaConforme);

    public Long countForFind();

    public BusinessObject newInstance(Boolean encomendaConforme);

}
