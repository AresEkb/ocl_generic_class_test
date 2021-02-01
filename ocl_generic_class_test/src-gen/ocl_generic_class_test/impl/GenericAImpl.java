/**
 */
package ocl_generic_class_test.impl;

import ocl_generic_class_test.ClassA;
import ocl_generic_class_test.GenericA;
import ocl_generic_class_test.Ocl_generic_class_testPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic A</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenericAImpl extends BaseGenericImpl<ClassA> implements GenericA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ocl_generic_class_testPackage.Literals.GENERIC_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setRef(ClassA newRef) {
		super.setRef(newRef);
	}

} //GenericAImpl
