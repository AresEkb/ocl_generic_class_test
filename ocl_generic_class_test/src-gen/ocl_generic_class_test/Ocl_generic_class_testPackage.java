/**
 */
package ocl_generic_class_test;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ocl_generic_class_test.Ocl_generic_class_testFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Ocl_generic_class_testPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ocl_generic_class_test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ocl_generic_class_test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ocl_generic_class_test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ocl_generic_class_testPackage eINSTANCE = ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl.init();

	/**
	 * The meta object id for the '{@link ocl_generic_class_test.impl.TestModelImpl <em>Test Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl_generic_class_test.impl.TestModelImpl
	 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getTestModel()
	 * @generated
	 */
	int TEST_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Generics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL__GENERICS = 1;

	/**
	 * The feature id for the '<em><b>Generics A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL__GENERICS_A = 2;

	/**
	 * The number of structural features of the '<em>Test Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ocl_generic_class_test.impl.BaseClassImpl <em>Base Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl_generic_class_test.impl.BaseClassImpl
	 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getBaseClass()
	 * @generated
	 */
	int BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ocl_generic_class_test.impl.ClassAImpl <em>Class A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl_generic_class_test.impl.ClassAImpl
	 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getClassA()
	 * @generated
	 */
	int CLASS_A = 2;

	/**
	 * The number of structural features of the '<em>Class A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_A_FEATURE_COUNT = BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_A_OPERATION_COUNT = BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl_generic_class_test.impl.ClassBImpl <em>Class B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl_generic_class_test.impl.ClassBImpl
	 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getClassB()
	 * @generated
	 */
	int CLASS_B = 3;

	/**
	 * The number of structural features of the '<em>Class B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_B_FEATURE_COUNT = BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_B_OPERATION_COUNT = BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl_generic_class_test.impl.BaseGenericImpl <em>Base Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl_generic_class_test.impl.BaseGenericImpl
	 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getBaseGeneric()
	 * @generated
	 */
	int BASE_GENERIC = 4;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_GENERIC__REF = 0;

	/**
	 * The number of structural features of the '<em>Base Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_GENERIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Base Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_GENERIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ocl_generic_class_test.impl.GenericAImpl <em>Generic A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl_generic_class_test.impl.GenericAImpl
	 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getGenericA()
	 * @generated
	 */
	int GENERIC_A = 5;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_A__REF = BASE_GENERIC__REF;

	/**
	 * The number of structural features of the '<em>Generic A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_A_FEATURE_COUNT = BASE_GENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_A_OPERATION_COUNT = BASE_GENERIC_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ocl_generic_class_test.TestModel <em>Test Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Model</em>'.
	 * @see ocl_generic_class_test.TestModel
	 * @generated
	 */
	EClass getTestModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ocl_generic_class_test.TestModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ocl_generic_class_test.TestModel#getClasses()
	 * @see #getTestModel()
	 * @generated
	 */
	EReference getTestModel_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link ocl_generic_class_test.TestModel#getGenerics <em>Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generics</em>'.
	 * @see ocl_generic_class_test.TestModel#getGenerics()
	 * @see #getTestModel()
	 * @generated
	 */
	EReference getTestModel_Generics();

	/**
	 * Returns the meta object for the reference list '{@link ocl_generic_class_test.TestModel#getGenericsA <em>Generics A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generics A</em>'.
	 * @see ocl_generic_class_test.TestModel#getGenericsA()
	 * @see #getTestModel()
	 * @generated
	 */
	EReference getTestModel_GenericsA();

	/**
	 * Returns the meta object for class '{@link ocl_generic_class_test.BaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Class</em>'.
	 * @see ocl_generic_class_test.BaseClass
	 * @generated
	 */
	EClass getBaseClass();

	/**
	 * Returns the meta object for class '{@link ocl_generic_class_test.ClassA <em>Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class A</em>'.
	 * @see ocl_generic_class_test.ClassA
	 * @generated
	 */
	EClass getClassA();

	/**
	 * Returns the meta object for class '{@link ocl_generic_class_test.ClassB <em>Class B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class B</em>'.
	 * @see ocl_generic_class_test.ClassB
	 * @generated
	 */
	EClass getClassB();

	/**
	 * Returns the meta object for class '{@link ocl_generic_class_test.BaseGeneric <em>Base Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Generic</em>'.
	 * @see ocl_generic_class_test.BaseGeneric
	 * @generated
	 */
	EClass getBaseGeneric();

	/**
	 * Returns the meta object for the reference '{@link ocl_generic_class_test.BaseGeneric#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see ocl_generic_class_test.BaseGeneric#getRef()
	 * @see #getBaseGeneric()
	 * @generated
	 */
	EReference getBaseGeneric_Ref();

	/**
	 * Returns the meta object for class '{@link ocl_generic_class_test.GenericA <em>Generic A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic A</em>'.
	 * @see ocl_generic_class_test.GenericA
	 * @generated
	 */
	EClass getGenericA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ocl_generic_class_testFactory getOcl_generic_class_testFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ocl_generic_class_test.impl.TestModelImpl <em>Test Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl_generic_class_test.impl.TestModelImpl
		 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getTestModel()
		 * @generated
		 */
		EClass TEST_MODEL = eINSTANCE.getTestModel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MODEL__CLASSES = eINSTANCE.getTestModel_Classes();

		/**
		 * The meta object literal for the '<em><b>Generics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MODEL__GENERICS = eINSTANCE.getTestModel_Generics();

		/**
		 * The meta object literal for the '<em><b>Generics A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MODEL__GENERICS_A = eINSTANCE.getTestModel_GenericsA();

		/**
		 * The meta object literal for the '{@link ocl_generic_class_test.impl.BaseClassImpl <em>Base Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl_generic_class_test.impl.BaseClassImpl
		 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getBaseClass()
		 * @generated
		 */
		EClass BASE_CLASS = eINSTANCE.getBaseClass();

		/**
		 * The meta object literal for the '{@link ocl_generic_class_test.impl.ClassAImpl <em>Class A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl_generic_class_test.impl.ClassAImpl
		 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getClassA()
		 * @generated
		 */
		EClass CLASS_A = eINSTANCE.getClassA();

		/**
		 * The meta object literal for the '{@link ocl_generic_class_test.impl.ClassBImpl <em>Class B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl_generic_class_test.impl.ClassBImpl
		 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getClassB()
		 * @generated
		 */
		EClass CLASS_B = eINSTANCE.getClassB();

		/**
		 * The meta object literal for the '{@link ocl_generic_class_test.impl.BaseGenericImpl <em>Base Generic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl_generic_class_test.impl.BaseGenericImpl
		 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getBaseGeneric()
		 * @generated
		 */
		EClass BASE_GENERIC = eINSTANCE.getBaseGeneric();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_GENERIC__REF = eINSTANCE.getBaseGeneric_Ref();

		/**
		 * The meta object literal for the '{@link ocl_generic_class_test.impl.GenericAImpl <em>Generic A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl_generic_class_test.impl.GenericAImpl
		 * @see ocl_generic_class_test.impl.Ocl_generic_class_testPackageImpl#getGenericA()
		 * @generated
		 */
		EClass GENERIC_A = eINSTANCE.getGenericA();

	}

} //Ocl_generic_class_testPackage
