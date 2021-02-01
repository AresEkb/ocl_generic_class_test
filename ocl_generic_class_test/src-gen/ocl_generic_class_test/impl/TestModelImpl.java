/**
 */
package ocl_generic_class_test.impl;

import java.util.Collection;

import ocl_generic_class_test.BaseClass;
import ocl_generic_class_test.BaseGeneric;
import ocl_generic_class_test.Ocl_generic_class_testPackage;
import ocl_generic_class_test.TestModel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocl_generic_class_test.impl.TestModelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link ocl_generic_class_test.impl.TestModelImpl#getGenerics <em>Generics</em>}</li>
 *   <li>{@link ocl_generic_class_test.impl.TestModelImpl#getGenericsA <em>Generics A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestModelImpl extends MinimalEObjectImpl.Container implements TestModel {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseClass> classes;

	/**
	 * The cached value of the '{@link #getGenerics() <em>Generics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerics()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseGeneric<?>> generics;

	/**
	 * The cached setting delegate for the '{@link #getGenericsA() <em>Generics A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericsA()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GENERICS_A__ESETTING_DELEGATE = ((EStructuralFeature.Internal) Ocl_generic_class_testPackage.Literals.TEST_MODEL__GENERICS_A)
			.getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ocl_generic_class_testPackage.Literals.TEST_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<BaseClass>(BaseClass.class, this,
					Ocl_generic_class_testPackage.TEST_MODEL__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseGeneric<?>> getGenerics() {
		if (generics == null) {
			generics = new EObjectContainmentEList<BaseGeneric<?>>(BaseGeneric.class, this,
					Ocl_generic_class_testPackage.TEST_MODEL__GENERICS);
		}
		return generics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BaseGeneric<?>> getGenericsA() {
		return (EList<BaseGeneric<?>>) GENERICS_A__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ocl_generic_class_testPackage.TEST_MODEL__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		case Ocl_generic_class_testPackage.TEST_MODEL__GENERICS:
			return ((InternalEList<?>) getGenerics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ocl_generic_class_testPackage.TEST_MODEL__CLASSES:
			return getClasses();
		case Ocl_generic_class_testPackage.TEST_MODEL__GENERICS:
			return getGenerics();
		case Ocl_generic_class_testPackage.TEST_MODEL__GENERICS_A:
			return getGenericsA();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ocl_generic_class_testPackage.TEST_MODEL__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends BaseClass>) newValue);
			return;
		case Ocl_generic_class_testPackage.TEST_MODEL__GENERICS:
			getGenerics().clear();
			getGenerics().addAll((Collection<? extends BaseGeneric<?>>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Ocl_generic_class_testPackage.TEST_MODEL__CLASSES:
			getClasses().clear();
			return;
		case Ocl_generic_class_testPackage.TEST_MODEL__GENERICS:
			getGenerics().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Ocl_generic_class_testPackage.TEST_MODEL__CLASSES:
			return classes != null && !classes.isEmpty();
		case Ocl_generic_class_testPackage.TEST_MODEL__GENERICS:
			return generics != null && !generics.isEmpty();
		case Ocl_generic_class_testPackage.TEST_MODEL__GENERICS_A:
			return GENERICS_A__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //TestModelImpl
