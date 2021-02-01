/**
 */
package ocl_generic_class_test.util;

import ocl_generic_class_test.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ocl_generic_class_test.Ocl_generic_class_testPackage
 * @generated
 */
public class Ocl_generic_class_testSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ocl_generic_class_testPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocl_generic_class_testSwitch() {
		if (modelPackage == null) {
			modelPackage = Ocl_generic_class_testPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Ocl_generic_class_testPackage.TEST_MODEL: {
			TestModel testModel = (TestModel) theEObject;
			T1 result = caseTestModel(testModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ocl_generic_class_testPackage.BASE_CLASS: {
			BaseClass baseClass = (BaseClass) theEObject;
			T1 result = caseBaseClass(baseClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ocl_generic_class_testPackage.CLASS_A: {
			ClassA classA = (ClassA) theEObject;
			T1 result = caseClassA(classA);
			if (result == null)
				result = caseBaseClass(classA);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ocl_generic_class_testPackage.CLASS_B: {
			ClassB classB = (ClassB) theEObject;
			T1 result = caseClassB(classB);
			if (result == null)
				result = caseBaseClass(classB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ocl_generic_class_testPackage.BASE_GENERIC: {
			BaseGeneric<?> baseGeneric = (BaseGeneric<?>) theEObject;
			T1 result = caseBaseGeneric(baseGeneric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ocl_generic_class_testPackage.GENERIC_A: {
			GenericA genericA = (GenericA) theEObject;
			T1 result = caseGenericA(genericA);
			if (result == null)
				result = caseBaseGeneric(genericA);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTestModel(TestModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBaseClass(BaseClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassA(ClassA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassB(ClassB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Generic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Generic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseBaseGeneric(BaseGeneric<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenericA(GenericA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //Ocl_generic_class_testSwitch
