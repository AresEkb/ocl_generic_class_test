/**
 */
package ocl_generic_class_test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Generic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl_generic_class_test.BaseGeneric#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see ocl_generic_class_test.Ocl_generic_class_testPackage#getBaseGeneric()
 * @model abstract="true"
 * @generated
 */
public interface BaseGeneric<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Object)
	 * @see ocl_generic_class_test.Ocl_generic_class_testPackage#getBaseGeneric_Ref()
	 * @model kind="reference"
	 * @generated
	 */
	T getRef();

	/**
	 * Sets the value of the '{@link ocl_generic_class_test.BaseGeneric#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(T value);

} // BaseGeneric
