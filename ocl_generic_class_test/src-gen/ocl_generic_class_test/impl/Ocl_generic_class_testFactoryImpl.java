/**
 */
package ocl_generic_class_test.impl;

import ocl_generic_class_test.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ocl_generic_class_testFactoryImpl extends EFactoryImpl implements Ocl_generic_class_testFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ocl_generic_class_testFactory init() {
		try {
			Ocl_generic_class_testFactory theOcl_generic_class_testFactory = (Ocl_generic_class_testFactory) EPackage.Registry.INSTANCE
					.getEFactory(Ocl_generic_class_testPackage.eNS_URI);
			if (theOcl_generic_class_testFactory != null) {
				return theOcl_generic_class_testFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ocl_generic_class_testFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocl_generic_class_testFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Ocl_generic_class_testPackage.TEST_MODEL:
			return createTestModel();
		case Ocl_generic_class_testPackage.CLASS_A:
			return createClassA();
		case Ocl_generic_class_testPackage.CLASS_B:
			return createClassB();
		case Ocl_generic_class_testPackage.GENERIC_A:
			return createGenericA();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestModel createTestModel() {
		TestModelImpl testModel = new TestModelImpl();
		return testModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassA createClassA() {
		ClassAImpl classA = new ClassAImpl();
		return classA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassB createClassB() {
		ClassBImpl classB = new ClassBImpl();
		return classB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericA createGenericA() {
		GenericAImpl genericA = new GenericAImpl();
		return genericA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ocl_generic_class_testPackage getOcl_generic_class_testPackage() {
		return (Ocl_generic_class_testPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ocl_generic_class_testPackage getPackage() {
		return Ocl_generic_class_testPackage.eINSTANCE;
	}

} //Ocl_generic_class_testFactoryImpl
