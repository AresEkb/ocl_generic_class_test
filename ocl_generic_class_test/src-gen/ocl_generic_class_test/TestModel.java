/**
 */
package ocl_generic_class_test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl_generic_class_test.TestModel#getClasses <em>Classes</em>}</li>
 *   <li>{@link ocl_generic_class_test.TestModel#getGenerics <em>Generics</em>}</li>
 *   <li>{@link ocl_generic_class_test.TestModel#getGenericsA <em>Generics A</em>}</li>
 * </ul>
 *
 * @see ocl_generic_class_test.Ocl_generic_class_testPackage#getTestModel()
 * @model
 * @generated
 */
public interface TestModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ocl_generic_class_test.BaseClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ocl_generic_class_test.Ocl_generic_class_testPackage#getTestModel_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Generics</b></em>' containment reference list.
	 * The list contents are of type {@link ocl_generic_class_test.BaseGeneric}<code>&lt;?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generics</em>' containment reference list.
	 * @see ocl_generic_class_test.Ocl_generic_class_testPackage#getTestModel_Generics()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseGeneric<?>> getGenerics();

	/**
	 * Returns the value of the '<em><b>Generics A</b></em>' reference list.
	 * The list contents are of type {@link ocl_generic_class_test.BaseGeneric}<code>&lt;?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generics A</em>' reference list.
	 * @see ocl_generic_class_test.Ocl_generic_class_testPackage#getTestModel_GenericsA()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.generics'"
	 * @generated
	 */
	EList<BaseGeneric<?>> getGenericsA();

} // TestModel
