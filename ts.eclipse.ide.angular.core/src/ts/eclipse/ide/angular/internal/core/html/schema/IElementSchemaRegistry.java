package ts.eclipse.ide.angular.internal.core.html.schema;

import ts.eclipse.ide.angular.core.html.INgBindingCollector;
import ts.eclipse.ide.angular.core.html.INgBindingType;

public interface IElementSchemaRegistry {

	boolean hasProperty(String tagName, String propName);

	boolean hasEvent(String tagName, String eventName);

	Object securityContext(String tagName, String propName);

	String getMappedPropName(String propName);

	void collectProperty(String tagName, String attrName, INgBindingType bindingType, INgBindingCollector collector);

	void collectEvent(String tagName, String attrName, INgBindingType bindingType, INgBindingCollector collector);
}
