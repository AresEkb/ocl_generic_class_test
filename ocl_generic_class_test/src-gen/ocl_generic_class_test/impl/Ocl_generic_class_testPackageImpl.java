/**
 */
package ocl_generic_class_test.impl;

import ocl_generic_class_test.BaseClass;
import ocl_generic_class_test.BaseGeneric;
import ocl_generic_class_test.ClassA;
import ocl_generic_class_test.ClassB;
import ocl_generic_class_test.GenericA;
import ocl_generic_class_test.Ocl_generic_class_testFactory;
import ocl_generic_class_test.Ocl_generic_class_testPackage;
import ocl_generic_class_test.TestModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ocl_generic_class_testPackageImpl extends EPackageImpl implements Ocl_generic_class_testPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseGenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ocl_generic_class_test.Ocl_generic_class_testPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ocl_generic_class_testPackageImpl() {
		super(eNS_URI, Ocl_generic_class_testFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Ocl_generic_class_testPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ocl_generic_class_testPackage init() {
		if (isInited)
			return (Ocl_generic_class_testPackage) EPackage.Registry.INSTANCE
					.getEPackage(Ocl_generic_class_testPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOcl_generic_class_testPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Ocl_generic_class_testPackageImpl theOcl_generic_class_testPackage = registeredOcl_generic_class_testPackage instanceof Ocl_generic_class_testPackageImpl
				? (Ocl_generic_class_testPackageImpl) registeredOcl_generic_class_testPackage
				: new Ocl_generic_class_testPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOcl_generic_class_testPackage.createPackageContents();

		// Initialize created meta-data
		theOcl_generic_class_testPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOcl_generic_class_testPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ocl_generic_class_testPackage.eNS_URI, theOcl_generic_class_testPackage);
		return theOcl_generic_class_testPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestModel() {
		return testModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestModel_Classes() {
		return (EReference) testModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestModel_Generics() {
		return (EReference) testModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestModel_GenericsA() {
		return (EReference) testModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseClass() {
		return baseClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassA() {
		return classAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassB() {
		return classBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseGeneric() {
		return baseGenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseGeneric_Ref() {
		return (EReference) baseGenericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericA() {
		return genericAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ocl_generic_class_testFactory getOcl_generic_class_testFactory() {
		return (Ocl_generic_class_testFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		testModelEClass = createEClass(TEST_MODEL);
		createEReference(testModelEClass, TEST_MODEL__CLASSES);
		createEReference(testModelEClass, TEST_MODEL__GENERICS);
		createEReference(testModelEClass, TEST_MODEL__GENERICS_A);

		baseClassEClass = createEClass(BASE_CLASS);

		classAEClass = createEClass(CLASS_A);

		classBEClass = createEClass(CLASS_B);

		baseGenericEClass = createEClass(BASE_GENERIC);
		createEReference(baseGenericEClass, BASE_GENERIC__REF);

		genericAEClass = createEClass(GENERIC_A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter baseGenericEClass_T = addETypeParameter(baseGenericEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		classAEClass.getESuperTypes().add(this.getBaseClass());
		classBEClass.getESuperTypes().add(this.getBaseClass());
		EGenericType g1 = createEGenericType(this.getBaseGeneric());
		EGenericType g2 = createEGenericType(this.getClassA());
		g1.getETypeArguments().add(g2);
		genericAEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(testModelEClass, TestModel.class, "TestModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestModel_Classes(), this.getBaseClass(), null, "classes", null, 0, -1, TestModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getBaseGeneric());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getTestModel_Generics(), g1, null, "generics", null, 0, -1, TestModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		g1 = createEGenericType(this.getBaseGeneric());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getTestModel_GenericsA(), g1, null, "genericsA", null, 0, -1, TestModel.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		initEClass(baseClassEClass, BaseClass.class, "BaseClass", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classAEClass, ClassA.class, "ClassA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classBEClass, ClassB.class, "ClassB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseGenericEClass, BaseGeneric.class, "BaseGeneric", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(baseGenericEClass_T);
		initEReference(getBaseGeneric_Ref(), g1, null, "ref", null, 0, 1, BaseGeneric.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(genericAEClass, GenericA.class, "GenericA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getTestModel_GenericsA(), source, new String[] { "derivation", "self.generics" });
	}

} //Ocl_generic_class_testPackageImpl
