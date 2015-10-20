/**
 */
package ahp.provider;

import ahp.util.AHPAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AHPItemProviderAdapterFactory extends AHPAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.Hierarchy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyItemProvider hierarchyItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.Hierarchy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHierarchyAdapter() {
		if (hierarchyItemProvider == null) {
			hierarchyItemProvider = new HierarchyItemProvider(this);
		}

		return hierarchyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.Goal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalItemProvider goalItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalAdapter() {
		if (goalItemProvider == null) {
			goalItemProvider = new GoalItemProvider(this);
		}

		return goalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.Criterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionItemProvider criterionItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.Criterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriterionAdapter() {
		if (criterionItemProvider == null) {
			criterionItemProvider = new CriterionItemProvider(this);
		}

		return criterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.CriterionAlternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionAlternativeItemProvider criterionAlternativeItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.CriterionAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriterionAlternativeAdapter() {
		if (criterionAlternativeItemProvider == null) {
			criterionAlternativeItemProvider = new CriterionAlternativeItemProvider(this);
		}

		return criterionAlternativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.Alternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeItemProvider alternativeItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.Alternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativeAdapter() {
		if (alternativeItemProvider == null) {
			alternativeItemProvider = new AlternativeItemProvider(this);
		}

		return alternativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.CriterionJudgment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionJudgmentItemProvider criterionJudgmentItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.CriterionJudgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriterionJudgmentAdapter() {
		if (criterionJudgmentItemProvider == null) {
			criterionJudgmentItemProvider = new CriterionJudgmentItemProvider(this);
		}

		return criterionJudgmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.AlternativeJudgment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeJudgmentItemProvider alternativeJudgmentItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.AlternativeJudgment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativeJudgmentAdapter() {
		if (alternativeJudgmentItemProvider == null) {
			alternativeJudgmentItemProvider = new AlternativeJudgmentItemProvider(this);
		}

		return alternativeJudgmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.GoalCriterionPriority} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalCriterionPriorityItemProvider goalCriterionPriorityItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.GoalCriterionPriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalCriterionPriorityAdapter() {
		if (goalCriterionPriorityItemProvider == null) {
			goalCriterionPriorityItemProvider = new GoalCriterionPriorityItemProvider(this);
		}

		return goalCriterionPriorityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.CriterionAlternativePriority} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionAlternativePriorityItemProvider criterionAlternativePriorityItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.CriterionAlternativePriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriterionAlternativePriorityAdapter() {
		if (criterionAlternativePriorityItemProvider == null) {
			criterionAlternativePriorityItemProvider = new CriterionAlternativePriorityItemProvider(this);
		}

		return criterionAlternativePriorityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.GoalAlternativePriority} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalAlternativePriorityItemProvider goalAlternativePriorityItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.GoalAlternativePriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalAlternativePriorityAdapter() {
		if (goalAlternativePriorityItemProvider == null) {
			goalAlternativePriorityItemProvider = new GoalAlternativePriorityItemProvider(this);
		}

		return goalAlternativePriorityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.GoalInconsistency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalInconsistencyItemProvider goalInconsistencyItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.GoalInconsistency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalInconsistencyAdapter() {
		if (goalInconsistencyItemProvider == null) {
			goalInconsistencyItemProvider = new GoalInconsistencyItemProvider(this);
		}

		return goalInconsistencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ahp.CriterionInconsistency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionInconsistencyItemProvider criterionInconsistencyItemProvider;

	/**
	 * This creates an adapter for a {@link ahp.CriterionInconsistency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriterionInconsistencyAdapter() {
		if (criterionInconsistencyItemProvider == null) {
			criterionInconsistencyItemProvider = new CriterionInconsistencyItemProvider(this);
		}

		return criterionInconsistencyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (hierarchyItemProvider != null) hierarchyItemProvider.dispose();
		if (goalItemProvider != null) goalItemProvider.dispose();
		if (criterionItemProvider != null) criterionItemProvider.dispose();
		if (alternativeItemProvider != null) alternativeItemProvider.dispose();
		if (criterionAlternativeItemProvider != null) criterionAlternativeItemProvider.dispose();
		if (criterionJudgmentItemProvider != null) criterionJudgmentItemProvider.dispose();
		if (alternativeJudgmentItemProvider != null) alternativeJudgmentItemProvider.dispose();
		if (goalCriterionPriorityItemProvider != null) goalCriterionPriorityItemProvider.dispose();
		if (criterionAlternativePriorityItemProvider != null) criterionAlternativePriorityItemProvider.dispose();
		if (goalAlternativePriorityItemProvider != null) goalAlternativePriorityItemProvider.dispose();
		if (goalInconsistencyItemProvider != null) goalInconsistencyItemProvider.dispose();
		if (criterionInconsistencyItemProvider != null) criterionInconsistencyItemProvider.dispose();
	}

}
