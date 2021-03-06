package com.github.andbed.cleanarch.eventtype.core.boundary.require;

import java.util.List;

public interface XMLParser {

	boolean isValid(String xmlPath, String xsdPath);

	<E> List<E> bind(Class<E> className);

}
