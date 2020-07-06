/**
 */
package emf.arithmetics.util;

import emf.arithmetics.AbstractDefinition;
import emf.arithmetics.ArithmeticsPackage;
import emf.arithmetics.DeclaredParameter;
import emf.arithmetics.Definition;
import emf.arithmetics.Div;
import emf.arithmetics.Evaluation;
import emf.arithmetics.Expression;
import emf.arithmetics.FunctionCall;
import emf.arithmetics.Import;
import emf.arithmetics.Minus;
import emf.arithmetics.Multi;
import emf.arithmetics.NumberLiteral;
import emf.arithmetics.Plus;
import emf.arithmetics.Statement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.arithmetics.ArithmeticsPackage
 * @generated
 */
public class ArithmeticsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArithmeticsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArithmeticsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticsSwitch<Adapter> modelSwitch = new ArithmeticsSwitch<Adapter>() {
		@Override
		public Adapter caseModule(emf.arithmetics.Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter caseImport(Import object) {
			return createImportAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseDefinition(Definition object) {
			return createDefinitionAdapter();
		}

		@Override
		public Adapter caseDeclaredParameter(DeclaredParameter object) {
			return createDeclaredParameterAdapter();
		}

		@Override
		public Adapter caseAbstractDefinition(AbstractDefinition object) {
			return createAbstractDefinitionAdapter();
		}

		@Override
		public Adapter caseEvaluation(Evaluation object) {
			return createEvaluationAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter caseMulti(Multi object) {
			return createMultiAdapter();
		}

		@Override
		public Adapter caseDiv(Div object) {
			return createDivAdapter();
		}

		@Override
		public Adapter caseNumberLiteral(NumberLiteral object) {
			return createNumberLiteralAdapter();
		}

		@Override
		public Adapter caseFunctionCall(FunctionCall object) {
			return createFunctionCallAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.DeclaredParameter <em>Declared Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.DeclaredParameter
	 * @generated
	 */
	public Adapter createDeclaredParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.AbstractDefinition <em>Abstract Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.AbstractDefinition
	 * @generated
	 */
	public Adapter createAbstractDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Multi <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Multi
	 * @generated
	 */
	public Adapter createMultiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.NumberLiteral
	 * @generated
	 */
	public Adapter createNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.arithmetics.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.arithmetics.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArithmeticsAdapterFactory
