/**
 */
package com.misc.projects.g4s.G4SOptiPost.impl;

import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.projects.g4s.G4SOptiPost.G4SOptiPostPackage;
import com.misc.projects.g4s.G4SOptiPost.LpEmployee;
import com.misc.projects.g4s.G4SOptiPost.LpJob;
import com.misc.projects.g4s.G4SOptiPost.LpPrecedence;
import com.misc.projects.g4s.G4SOptiPost.LpRoot;
import com.misc.projects.g4s.G4SOptiPost.Shift;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#getJobsAfter <em>Jobs After</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#getJobsBefore <em>Jobs Before</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#isStartOfMonth <em>Start Of Month</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#isEndOfMonth <em>End Of Month</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#getLpRoot <em>Lp Root</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#getLpEmployee <em>Lp Employee</em>}</li>
 *   <li>{@link com.misc.projects.g4s.G4SOptiPost.impl.LpJobImpl#getVarInPost <em>Var In Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LpJobImpl extends GeneratorTupleImpl implements LpJob {
	/**
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected Shift shift;

	/**
	 * The cached value of the '{@link #getJobsAfter() <em>Jobs After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobsAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<LpPrecedence> jobsAfter;

	/**
	 * The cached value of the '{@link #getJobsBefore() <em>Jobs Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobsBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<LpPrecedence> jobsBefore;

	/**
	 * The default value of the '{@link #isStartOfMonth() <em>Start Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartOfMonth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_OF_MONTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartOfMonth() <em>Start Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartOfMonth()
	 * @generated
	 * @ordered
	 */
	protected boolean startOfMonth = START_OF_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isEndOfMonth() <em>End Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndOfMonth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean END_OF_MONTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEndOfMonth() <em>End Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndOfMonth()
	 * @generated
	 * @ordered
	 */
	protected boolean endOfMonth = END_OF_MONTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLpEmployee() <em>Lp Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpEmployee()
	 * @generated
	 * @ordered
	 */
	protected LpEmployee lpEmployee;

	/**
	 * The cached value of the '{@link #getVarInPost() <em>Var In Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarInPost()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar varInPost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return G4SOptiPostPackage.Literals.LP_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift getShift() {
		if (shift != null && shift.eIsProxy()) {
			InternalEObject oldShift = (InternalEObject)shift;
			shift = (Shift)eResolveProxy(oldShift);
			if (shift != oldShift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.LP_JOB__SHIFT, oldShift, shift));
			}
		}
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift basicGetShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShift(Shift newShift) {
		Shift oldShift = shift;
		shift = newShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__SHIFT, oldShift, shift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpPrecedence> getJobsAfter() {
		if (jobsAfter == null) {
			jobsAfter = new EObjectWithInverseResolvingEList<LpPrecedence>(LpPrecedence.class, this, G4SOptiPostPackage.LP_JOB__JOBS_AFTER, G4SOptiPostPackage.LP_PRECEDENCE__JOB_BEFORE);
		}
		return jobsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpPrecedence> getJobsBefore() {
		if (jobsBefore == null) {
			jobsBefore = new EObjectWithInverseResolvingEList<LpPrecedence>(LpPrecedence.class, this, G4SOptiPostPackage.LP_JOB__JOBS_BEFORE, G4SOptiPostPackage.LP_PRECEDENCE__JOB_AFTER);
		}
		return jobsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartOfMonth() {
		return startOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfMonth(boolean newStartOfMonth) {
		boolean oldStartOfMonth = startOfMonth;
		startOfMonth = newStartOfMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__START_OF_MONTH, oldStartOfMonth, startOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEndOfMonth() {
		return endOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfMonth(boolean newEndOfMonth) {
		boolean oldEndOfMonth = endOfMonth;
		endOfMonth = newEndOfMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__END_OF_MONTH, oldEndOfMonth, endOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpRoot getLpRoot() {
		if (eContainerFeatureID() != G4SOptiPostPackage.LP_JOB__LP_ROOT) return null;
		return (LpRoot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpRoot(LpRoot newLpRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLpRoot, G4SOptiPostPackage.LP_JOB__LP_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpRoot(LpRoot newLpRoot) {
		if (newLpRoot != eInternalContainer() || (eContainerFeatureID() != G4SOptiPostPackage.LP_JOB__LP_ROOT && newLpRoot != null)) {
			if (EcoreUtil.isAncestor(this, newLpRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLpRoot != null)
				msgs = ((InternalEObject)newLpRoot).eInverseAdd(this, G4SOptiPostPackage.LP_ROOT__JOBS, LpRoot.class, msgs);
			msgs = basicSetLpRoot(newLpRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__LP_ROOT, newLpRoot, newLpRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpEmployee getLpEmployee() {
		if (lpEmployee != null && lpEmployee.eIsProxy()) {
			InternalEObject oldLpEmployee = (InternalEObject)lpEmployee;
			lpEmployee = (LpEmployee)eResolveProxy(oldLpEmployee);
			if (lpEmployee != oldLpEmployee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE, oldLpEmployee, lpEmployee));
			}
		}
		return lpEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpEmployee basicGetLpEmployee() {
		return lpEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpEmployee(LpEmployee newLpEmployee, NotificationChain msgs) {
		LpEmployee oldLpEmployee = lpEmployee;
		lpEmployee = newLpEmployee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE, oldLpEmployee, newLpEmployee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpEmployee(LpEmployee newLpEmployee) {
		if (newLpEmployee != lpEmployee) {
			NotificationChain msgs = null;
			if (lpEmployee != null)
				msgs = ((InternalEObject)lpEmployee).eInverseRemove(this, G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS, LpEmployee.class, msgs);
			if (newLpEmployee != null)
				msgs = ((InternalEObject)newLpEmployee).eInverseAdd(this, G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS, LpEmployee.class, msgs);
			msgs = basicSetLpEmployee(newLpEmployee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE, newLpEmployee, newLpEmployee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getVarInPost() {
		return varInPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarInPost(GeneratorLpVar newVarInPost, NotificationChain msgs) {
		GeneratorLpVar oldVarInPost = varInPost;
		varInPost = newVarInPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__VAR_IN_POST, oldVarInPost, newVarInPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarInPost(GeneratorLpVar newVarInPost) {
		if (newVarInPost != varInPost) {
			NotificationChain msgs = null;
			if (varInPost != null)
				msgs = ((InternalEObject)varInPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_JOB__VAR_IN_POST, null, msgs);
			if (newVarInPost != null)
				msgs = ((InternalEObject)newVarInPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - G4SOptiPostPackage.LP_JOB__VAR_IN_POST, null, msgs);
			msgs = basicSetVarInPost(newVarInPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, G4SOptiPostPackage.LP_JOB__VAR_IN_POST, newVarInPost, newVarInPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_JOB__JOBS_AFTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobsAfter()).basicAdd(otherEnd, msgs);
			case G4SOptiPostPackage.LP_JOB__JOBS_BEFORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobsBefore()).basicAdd(otherEnd, msgs);
			case G4SOptiPostPackage.LP_JOB__LP_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLpRoot((LpRoot)otherEnd, msgs);
			case G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE:
				if (lpEmployee != null)
					msgs = ((InternalEObject)lpEmployee).eInverseRemove(this, G4SOptiPostPackage.LP_EMPLOYEE__LP_JOBS, LpEmployee.class, msgs);
				return basicSetLpEmployee((LpEmployee)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_JOB__JOBS_AFTER:
				return ((InternalEList<?>)getJobsAfter()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.LP_JOB__JOBS_BEFORE:
				return ((InternalEList<?>)getJobsBefore()).basicRemove(otherEnd, msgs);
			case G4SOptiPostPackage.LP_JOB__LP_ROOT:
				return basicSetLpRoot(null, msgs);
			case G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE:
				return basicSetLpEmployee(null, msgs);
			case G4SOptiPostPackage.LP_JOB__VAR_IN_POST:
				return basicSetVarInPost(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case G4SOptiPostPackage.LP_JOB__LP_ROOT:
				return eInternalContainer().eInverseRemove(this, G4SOptiPostPackage.LP_ROOT__JOBS, LpRoot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case G4SOptiPostPackage.LP_JOB__SHIFT:
				if (resolve) return getShift();
				return basicGetShift();
			case G4SOptiPostPackage.LP_JOB__JOBS_AFTER:
				return getJobsAfter();
			case G4SOptiPostPackage.LP_JOB__JOBS_BEFORE:
				return getJobsBefore();
			case G4SOptiPostPackage.LP_JOB__START_OF_MONTH:
				return isStartOfMonth();
			case G4SOptiPostPackage.LP_JOB__END_OF_MONTH:
				return isEndOfMonth();
			case G4SOptiPostPackage.LP_JOB__LP_ROOT:
				return getLpRoot();
			case G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE:
				if (resolve) return getLpEmployee();
				return basicGetLpEmployee();
			case G4SOptiPostPackage.LP_JOB__VAR_IN_POST:
				return getVarInPost();
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
			case G4SOptiPostPackage.LP_JOB__SHIFT:
				setShift((Shift)newValue);
				return;
			case G4SOptiPostPackage.LP_JOB__JOBS_AFTER:
				getJobsAfter().clear();
				getJobsAfter().addAll((Collection<? extends LpPrecedence>)newValue);
				return;
			case G4SOptiPostPackage.LP_JOB__JOBS_BEFORE:
				getJobsBefore().clear();
				getJobsBefore().addAll((Collection<? extends LpPrecedence>)newValue);
				return;
			case G4SOptiPostPackage.LP_JOB__START_OF_MONTH:
				setStartOfMonth((Boolean)newValue);
				return;
			case G4SOptiPostPackage.LP_JOB__END_OF_MONTH:
				setEndOfMonth((Boolean)newValue);
				return;
			case G4SOptiPostPackage.LP_JOB__LP_ROOT:
				setLpRoot((LpRoot)newValue);
				return;
			case G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE:
				setLpEmployee((LpEmployee)newValue);
				return;
			case G4SOptiPostPackage.LP_JOB__VAR_IN_POST:
				setVarInPost((GeneratorLpVar)newValue);
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
			case G4SOptiPostPackage.LP_JOB__SHIFT:
				setShift((Shift)null);
				return;
			case G4SOptiPostPackage.LP_JOB__JOBS_AFTER:
				getJobsAfter().clear();
				return;
			case G4SOptiPostPackage.LP_JOB__JOBS_BEFORE:
				getJobsBefore().clear();
				return;
			case G4SOptiPostPackage.LP_JOB__START_OF_MONTH:
				setStartOfMonth(START_OF_MONTH_EDEFAULT);
				return;
			case G4SOptiPostPackage.LP_JOB__END_OF_MONTH:
				setEndOfMonth(END_OF_MONTH_EDEFAULT);
				return;
			case G4SOptiPostPackage.LP_JOB__LP_ROOT:
				setLpRoot((LpRoot)null);
				return;
			case G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE:
				setLpEmployee((LpEmployee)null);
				return;
			case G4SOptiPostPackage.LP_JOB__VAR_IN_POST:
				setVarInPost((GeneratorLpVar)null);
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
			case G4SOptiPostPackage.LP_JOB__SHIFT:
				return shift != null;
			case G4SOptiPostPackage.LP_JOB__JOBS_AFTER:
				return jobsAfter != null && !jobsAfter.isEmpty();
			case G4SOptiPostPackage.LP_JOB__JOBS_BEFORE:
				return jobsBefore != null && !jobsBefore.isEmpty();
			case G4SOptiPostPackage.LP_JOB__START_OF_MONTH:
				return startOfMonth != START_OF_MONTH_EDEFAULT;
			case G4SOptiPostPackage.LP_JOB__END_OF_MONTH:
				return endOfMonth != END_OF_MONTH_EDEFAULT;
			case G4SOptiPostPackage.LP_JOB__LP_ROOT:
				return getLpRoot() != null;
			case G4SOptiPostPackage.LP_JOB__LP_EMPLOYEE:
				return lpEmployee != null;
			case G4SOptiPostPackage.LP_JOB__VAR_IN_POST:
				return varInPost != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (StartOfMonth: ");
		result.append(startOfMonth);
		result.append(", EndOfMonth: ");
		result.append(endOfMonth);
		result.append(')');
		return result.toString();
	}

	@Override
	public void generateTuples() {
		// TODO Auto-generated method stub
		super.generateTuples();
	}
	
	@Override
	public void generateVars() {
		super.generateVars();
		
		this.generateVarInPost();
	}
	
	private void generateVarInPost() {
		GeneratorLpVar newVar = SolverFactory.eINSTANCE.createGeneratorLpVar();
		newVar.setLowerBound(0.0f);
		newVar.setLowerBound(1.0f);
		newVar.setType(EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER);
		newVar.setName("inpost");
		this.setVarInPost(newVar);
	}

	
} //LpJobImpl
