package com.misc.projects.g4s.G4SOptiPost.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.projects.g4s.G4SOptiPost.Domain;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostFactory;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;

public class DomainShiftsItemProvider extends TransientDomainItemProvider {

	public DomainShiftsItemProvider(AdapterFactory adapterFactory,
			Domain domain) {
		super(adapterFactory, domain);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(G4SOptiPostPackage.Literals.DOMAIN__SHIFTS);
		}			

		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "Shifts";
	}

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	
		newChildDescriptors.add(createChildParameter(G4SOptiPostPackage.Literals.DOMAIN__SHIFTS,
													 G4SOptiPostFactory.eINSTANCE.createLocation()));
		}
	}
