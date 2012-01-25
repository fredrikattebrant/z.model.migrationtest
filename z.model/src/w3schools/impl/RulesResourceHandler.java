package w3schools.impl;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

public class RulesResourceHandler extends BasicResourceHandler {

	@Override
	public void postLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
		final Map extMap = resource.getEObjectToExtensionMap();
		for(Iterator itr = extMap.entrySet().iterator(); itr.hasNext();) {
			Map.Entry entry = (Map.Entry) itr.next();
			EObject key = (EObject) entry.getKey();
			AnyType value = (AnyType) entry.getValue();
			handleUnkownData(key, value);
		}
	}

	private void handleUnkownData(EObject eObj, AnyType unknownData) {
		handleUnknownFeatures(eObj, unknownData.getMixed());
		handleUnknownFeatures(eObj, unknownData.getAnyAttribute());
		
	}

	private void handleUnknownFeatures(EObject owner, FeatureMap featureMap) {
		for (Iterator iter = featureMap.iterator(); iter.hasNext();) {
			FeatureMap.Entry entry = (FeatureMap.Entry) iter.next();
			EStructuralFeature f = entry.getEStructuralFeature();
			if (handleUnknownFeature(owner, f, entry.getValue())) {
				iter.remove();
			}
		}
		
	}

	/**
	 * Determines whether to remove the feature or not (?)
	 * @param owner
	 * @param f
	 * @param value
	 * @return
	 */
	private boolean handleUnknownFeature(EObject owner, EStructuralFeature f,
			Object value) {
		System.out.println("Owner: " + owner + ", " + f.getName());
		return false;
	}
}
