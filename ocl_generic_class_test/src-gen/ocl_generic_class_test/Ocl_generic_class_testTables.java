/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /ocl_generic_class_test/model/ocl_generic_class_test.ecore
 * using:
 *   /ocl_generic_class_test/model/ocl_generic_class_test.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package ocl_generic_class_test;

import ocl_generic_class_test.Ocl_generic_class_testTables;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorTypeParameter;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * Ocl_generic_class_testTables provides the dispatch tables for the ocl_generic_class_test for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Ocl_generic_class_testTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Ocl_generic_class_testPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Ocl_generic_class_testTables.init();
		}

		public static final ExecutorTypeParameter _BaseGeneric_T = new ExecutorTypeParameter(TypeId.T_1, "T");

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _BaseClass = new EcoreExecutorType(Ocl_generic_class_testPackage.Literals.BASE_CLASS, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _BaseGeneric = new EcoreExecutorType(Ocl_generic_class_testPackage.Literals.BASE_GENERIC, PACKAGE, 0 | ExecutorType.ABSTRACT, TypeParameters._BaseGeneric_T);
		public static final EcoreExecutorType _ClassA = new EcoreExecutorType(Ocl_generic_class_testPackage.Literals.CLASS_A, PACKAGE, 0);
		public static final EcoreExecutorType _ClassB = new EcoreExecutorType(Ocl_generic_class_testPackage.Literals.CLASS_B, PACKAGE, 0);
		public static final EcoreExecutorType _GenericA = new EcoreExecutorType(Ocl_generic_class_testPackage.Literals.GENERIC_A, PACKAGE, 0);
		public static final EcoreExecutorType _TestModel = new EcoreExecutorType(Ocl_generic_class_testPackage.Literals.TEST_MODEL, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_BaseClass,
			_BaseGeneric,
			_ClassA,
			_ClassB,
			_GenericA,
			_TestModel
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _BaseClass__BaseClass = new ExecutorFragment(Types._BaseClass, Ocl_generic_class_testTables.Types._BaseClass);
		private static final ExecutorFragment _BaseClass__OclAny = new ExecutorFragment(Types._BaseClass, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BaseClass__OclElement = new ExecutorFragment(Types._BaseClass, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BaseGeneric__BaseGeneric = new ExecutorFragment(Types._BaseGeneric, Ocl_generic_class_testTables.Types._BaseGeneric);
		private static final ExecutorFragment _BaseGeneric__OclAny = new ExecutorFragment(Types._BaseGeneric, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BaseGeneric__OclElement = new ExecutorFragment(Types._BaseGeneric, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ClassA__BaseClass = new ExecutorFragment(Types._ClassA, Ocl_generic_class_testTables.Types._BaseClass);
		private static final ExecutorFragment _ClassA__ClassA = new ExecutorFragment(Types._ClassA, Ocl_generic_class_testTables.Types._ClassA);
		private static final ExecutorFragment _ClassA__OclAny = new ExecutorFragment(Types._ClassA, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ClassA__OclElement = new ExecutorFragment(Types._ClassA, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ClassB__BaseClass = new ExecutorFragment(Types._ClassB, Ocl_generic_class_testTables.Types._BaseClass);
		private static final ExecutorFragment _ClassB__ClassB = new ExecutorFragment(Types._ClassB, Ocl_generic_class_testTables.Types._ClassB);
		private static final ExecutorFragment _ClassB__OclAny = new ExecutorFragment(Types._ClassB, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ClassB__OclElement = new ExecutorFragment(Types._ClassB, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _GenericA__BaseGeneric = new ExecutorFragment(Types._GenericA, Ocl_generic_class_testTables.Types._BaseGeneric);
		private static final ExecutorFragment _GenericA__GenericA = new ExecutorFragment(Types._GenericA, Ocl_generic_class_testTables.Types._GenericA);
		private static final ExecutorFragment _GenericA__OclAny = new ExecutorFragment(Types._GenericA, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GenericA__OclElement = new ExecutorFragment(Types._GenericA, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _TestModel__OclAny = new ExecutorFragment(Types._TestModel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TestModel__OclElement = new ExecutorFragment(Types._TestModel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TestModel__TestModel = new ExecutorFragment(Types._TestModel, Ocl_generic_class_testTables.Types._TestModel);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _BaseClass__TestModel__classes = new ExecutorPropertyWithImplementation("TestModel", Types._BaseClass, 0, new EcoreLibraryOppositeProperty(Ocl_generic_class_testPackage.Literals.TEST_MODEL__CLASSES));

		public static final ExecutorProperty _BaseGeneric__ref = new EcoreExecutorProperty(Ocl_generic_class_testPackage.Literals.BASE_GENERIC__REF, Types._BaseGeneric, 0);

		public static final ExecutorProperty _TestModel__classes = new EcoreExecutorProperty(Ocl_generic_class_testPackage.Literals.TEST_MODEL__CLASSES, Types._TestModel, 0);
		public static final ExecutorProperty _TestModel__generics = new EcoreExecutorProperty(Ocl_generic_class_testPackage.Literals.TEST_MODEL__GENERICS, Types._TestModel, 1);
		public static final ExecutorProperty _TestModel__genericsA = new EcoreExecutorProperty(Ocl_generic_class_testPackage.Literals.TEST_MODEL__GENERICS_A, Types._TestModel, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _BaseClass =
			{
				Fragments._BaseClass__OclAny /* 0 */,
				Fragments._BaseClass__OclElement /* 1 */,
				Fragments._BaseClass__BaseClass /* 2 */
			};
		private static final int /*@NonNull*/ [] __BaseClass = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BaseGeneric =
			{
				Fragments._BaseGeneric__OclAny /* 0 */,
				Fragments._BaseGeneric__OclElement /* 1 */,
				Fragments._BaseGeneric__BaseGeneric /* 2 */
			};
		private static final int /*@NonNull*/ [] __BaseGeneric = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ClassA =
			{
				Fragments._ClassA__OclAny /* 0 */,
				Fragments._ClassA__OclElement /* 1 */,
				Fragments._ClassA__BaseClass /* 2 */,
				Fragments._ClassA__ClassA /* 3 */
			};
		private static final int /*@NonNull*/ [] __ClassA = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ClassB =
			{
				Fragments._ClassB__OclAny /* 0 */,
				Fragments._ClassB__OclElement /* 1 */,
				Fragments._ClassB__BaseClass /* 2 */,
				Fragments._ClassB__ClassB /* 3 */
			};
		private static final int /*@NonNull*/ [] __ClassB = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GenericA =
			{
				Fragments._GenericA__OclAny /* 0 */,
				Fragments._GenericA__OclElement /* 1 */,
				Fragments._GenericA__BaseGeneric /* 2 */,
				Fragments._GenericA__GenericA /* 3 */
			};
		private static final int /*@NonNull*/ [] __GenericA = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TestModel =
			{
				Fragments._TestModel__OclAny /* 0 */,
				Fragments._TestModel__OclElement /* 1 */,
				Fragments._TestModel__TestModel /* 2 */
			};
		private static final int /*@NonNull*/ [] __TestModel = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BaseClass.initFragments(_BaseClass, __BaseClass);
			Types._BaseGeneric.initFragments(_BaseGeneric, __BaseGeneric);
			Types._ClassA.initFragments(_ClassA, __ClassA);
			Types._ClassB.initFragments(_ClassB, __ClassB);
			Types._GenericA.initFragments(_GenericA, __GenericA);
			Types._TestModel.initFragments(_TestModel, __TestModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _BaseClass__BaseClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BaseGeneric__BaseGeneric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseGeneric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseGeneric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ClassA__ClassA = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassA__BaseClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassA__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassA__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ClassB__ClassB = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassB__BaseClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassB__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ClassB__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _GenericA__GenericA = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GenericA__BaseGeneric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GenericA__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GenericA__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TestModel__TestModel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TestModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TestModel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BaseClass__BaseClass.initOperations(_BaseClass__BaseClass);
			Fragments._BaseClass__OclAny.initOperations(_BaseClass__OclAny);
			Fragments._BaseClass__OclElement.initOperations(_BaseClass__OclElement);

			Fragments._BaseGeneric__BaseGeneric.initOperations(_BaseGeneric__BaseGeneric);
			Fragments._BaseGeneric__OclAny.initOperations(_BaseGeneric__OclAny);
			Fragments._BaseGeneric__OclElement.initOperations(_BaseGeneric__OclElement);

			Fragments._ClassA__BaseClass.initOperations(_ClassA__BaseClass);
			Fragments._ClassA__ClassA.initOperations(_ClassA__ClassA);
			Fragments._ClassA__OclAny.initOperations(_ClassA__OclAny);
			Fragments._ClassA__OclElement.initOperations(_ClassA__OclElement);

			Fragments._ClassB__BaseClass.initOperations(_ClassB__BaseClass);
			Fragments._ClassB__ClassB.initOperations(_ClassB__ClassB);
			Fragments._ClassB__OclAny.initOperations(_ClassB__OclAny);
			Fragments._ClassB__OclElement.initOperations(_ClassB__OclElement);

			Fragments._GenericA__BaseGeneric.initOperations(_GenericA__BaseGeneric);
			Fragments._GenericA__GenericA.initOperations(_GenericA__GenericA);
			Fragments._GenericA__OclAny.initOperations(_GenericA__OclAny);
			Fragments._GenericA__OclElement.initOperations(_GenericA__OclElement);

			Fragments._TestModel__OclAny.initOperations(_TestModel__OclAny);
			Fragments._TestModel__OclElement.initOperations(_TestModel__OclElement);
			Fragments._TestModel__TestModel.initOperations(_TestModel__TestModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _BaseClass = {};

		private static final ExecutorProperty /*@NonNull*/ [] _BaseGeneric = {
			Ocl_generic_class_testTables.Properties._BaseGeneric__ref
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ClassA = {};

		private static final ExecutorProperty /*@NonNull*/ [] _ClassB = {};

		private static final ExecutorProperty /*@NonNull*/ [] _GenericA = {
			Ocl_generic_class_testTables.Properties._BaseGeneric__ref
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TestModel = {
			Ocl_generic_class_testTables.Properties._TestModel__classes,
			Ocl_generic_class_testTables.Properties._TestModel__generics,
			Ocl_generic_class_testTables.Properties._TestModel__genericsA
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BaseClass__BaseClass.initProperties(_BaseClass);
			Fragments._BaseGeneric__BaseGeneric.initProperties(_BaseGeneric);
			Fragments._ClassA__ClassA.initProperties(_ClassA);
			Fragments._ClassB__ClassB.initProperties(_ClassB);
			Fragments._GenericA__GenericA.initProperties(_GenericA);
			Fragments._TestModel__TestModel.initProperties(_TestModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ocl_generic_class_testTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
