package net.siekiera.mgc.dao;

import net.siekiera.mgc.model.Samochod;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by eric on 08.05.2016.
 */
@Transactional
public interface SamochodDao extends SamochodBaseDao<Samochod> {
}
