/**
 */
package ocl_generic_class_test.util;

import ocl_generic_class_test.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ocl_generic_class_test.Ocl_generic_class_testPackage
 * @generated
 */
public class Ocl_generic_class_testAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ocl_generic_class_testPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocl_generic_class_testAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ocl_generic_class_testPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ocl_generic_class_testSwitch<Adapter> modelSwitch = new Ocl_generic_class_testSwitch<Adapter>() {
		@Override
		public Adapter caseTestModel(TestModel object) {
			return createTestModelAdapter();
		}

		@Override
		public Adapter caseBaseClass(BaseClass object) {
			return createBaseClassAdapter();
		}

		@Override
		public Adapter caseClassA(ClassA object) {
			return createClassAAdapter();
		}

		@Override
		public Adapter caseClassB(ClassB object) {
			return createClassBAdapter();
		}

		@Override
		public <T> Adapter caseBaseGeneric(BaseGeneric<T> object) {
			return createBaseGenericAdapter();
		}

		@Override
		public Adapter caseGenericA(GenericA object) {
			return createGenericAAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocl_generic_class_test.TestModel <em>Test Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocl_generic_class_test.TestModel
	 * @generated
	 */
	public Adapter createTestModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocl_generic_class_test.BaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocl_generic_class_test.BaseClass
	 * @generated
	 */
	public Adapter createBaseClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocl_generic_class_test.ClassA <em>Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocl_generic_class_test.ClassA
	 * @generated
	 */
	public Adapter createClassAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocl_generic_class_test.ClassB <em>Class B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocl_generic_class_test.ClassB
	 * @generated
	 */
	public Adapter createClassBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocl_generic_class_test.BaseGeneric <em>Base Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocl_generic_class_test.BaseGeneric
	 * @generated
	 */
	public Adapter createBaseGenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocl_generic_class_test.GenericA <em>Generic A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocl_generic_class_test.GenericA
	 * @generated
	 */
	public Adapter createGenericAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ocl_generic_class_testAdapterFactory
