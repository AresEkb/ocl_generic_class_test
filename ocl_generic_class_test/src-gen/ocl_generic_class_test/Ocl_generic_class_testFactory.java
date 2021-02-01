/**
 */
package ocl_generic_class_test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ocl_generic_class_test.Ocl_generic_class_testPackage
 * @generated
 */
public interface Ocl_generic_class_testFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ocl_generic_class_testFactory eINSTANCE = ocl_generic_class_test.impl.Ocl_generic_class_testFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Model</em>'.
	 * @generated
	 */
	TestModel createTestModel();

	/**
	 * Returns a new object of class '<em>Class A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class A</em>'.
	 * @generated
	 */
	ClassA createClassA();

	/**
	 * Returns a new object of class '<em>Class B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class B</em>'.
	 * @generated
	 */
	ClassB createClassB();

	/**
	 * Returns a new object of class '<em>Generic A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic A</em>'.
	 * @generated
	 */
	GenericA createGenericA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ocl_generic_class_testPackage getOcl_generic_class_testPackage();

} //Ocl_generic_class_testFactory
