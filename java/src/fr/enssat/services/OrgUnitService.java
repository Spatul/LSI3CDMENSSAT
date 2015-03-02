package fr.enssat.services;

import fr.enssat.beans.OrgUnit;

public interface OrgUnitService 
{
	OrgUnit getOrgUnit(String idCDM);
	//retourne l'orgunit li� au cmd identifi� par idCDM
	//retourne null si le cdm n'a pas ete trouve
	
	boolean updateOrgUnit(String idCDM, OrgUnit newOrgUnit);
	//remplace l'orgunit lie au cmd identifi� par idCDM par newOrgUnit
	//retourne null si le cdm n'a pas ete trouve
}
