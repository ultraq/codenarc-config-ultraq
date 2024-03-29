/**
 * CodeNarc rules to apply to the project.
 *
 * @author Emanuel Rabina
 */
ruleset {

	// rulesets/basic.xml
	AssertWithinFinallyBlock
	AssignmentInConditional
	BigDecimalInstantiation
	BitwiseOperatorInConditional
	BooleanGetBoolean
	BrokenNullCheck
	BrokenOddnessCheck
	ClassForName
	ComparisonOfTwoConstants
	ComparisonWithSelf
	ConstantAssertExpression
	ConstantIfExpression
	ConstantTernaryExpression
	DeadCode
	DoubleNegative
	DuplicateCaseStatement
	DuplicateMapKey
	DuplicateSetValue
	EmptyCatchBlock
	EmptyClass
	EmptyElseBlock
	EmptyFinallyBlock
	EmptyForStatement
	EmptyIfStatement
	EmptyInstanceInitializer
	EmptyMethod
	EmptyStaticInitializer
	EmptySwitchStatement
	EmptySynchronizedStatement
	EmptyTryBlock
	EmptyWhileStatement
	EqualsAndHashCode
	EqualsOverloaded
	ExplicitGarbageCollection
	ForLoopShouldBeWhileLoop
	HardCodedWindowsFileSeparator
	HardCodedWindowsRootDirectory
	IntegerGetInteger
	MultipleUnaryOperators
	RandomDoubleCoercedToZero
	RemoveAllOnSelf
	ReturnFromFinallyBlock
	ThrowExceptionFromFinallyBlock

	// rulesets/braces.xml
	ElseBlockBraces
	ForStatementBraces
	IfStatementBraces
	WhileStatementBraces

	// rulesets/concurrency.xml
	BusyWait
	DoubleCheckedLocking
	InconsistentPropertyLocking
	InconsistentPropertySynchronization
	NestedSynchronization
	StaticCalendarField
	StaticConnection
	StaticDateFormatField
	StaticMatcherField
	StaticSimpleDateFormatField
	SynchronizedMethod
	SynchronizedOnBoxedPrimitive
	SynchronizedOnGetClass
	SynchronizedOnReentrantLock
	SynchronizedOnString
	SynchronizedOnThis
	SynchronizedReadObjectMethod
	SystemRunFinalizersOnExit
	ThisReferenceEscapesConstructor
	ThreadGroup
	ThreadLocalNotStaticFinal
	ThreadYield
	UseOfNotifyMethod
	VolatileArrayField
	VolatileLongOrDoubleField
	WaitOutsideOfWhileLoop

	// rulesets/convention.xml
	ConfusingTernary
	CouldBeElvis
	HashtableIsObsolete
	IfStatementCouldBeTernary
	InvertedIfElse
	LongLiteralWithLowerCaseL
	ParameterReassignment
	TernaryCouldBeElvis
	VectorIsObsolete

	// rulesets/design.xml
	AbstractClassWithPublicConstructor
	AbstractClassWithoutAbstractMethod
	AssignmentToStaticFieldFromInstanceMethod
	BooleanMethodReturnsNull
	BuilderMethodWithSideEffects
	CloneableWithoutClone
	CloseWithoutCloseable
	CompareToWithoutComparable
	ConstantsOnlyInterface
	EmptyMethodInAbstractClass
	FinalClassWithProtectedMember
	LocaleSetDefault
	NestedForLoop
	PrivateFieldCouldBeFinal
	PublicInstanceField
	ReturnsNullInsteadOfEmptyArray
	ReturnsNullInsteadOfEmptyCollection
	SimpleDateFormatMissingLocale
	StatelessSingleton
	ToStringReturnsNull

	// rulesets/dry.xml
	DuplicateListLiteral
	DuplicateMapLiteral

	// rulesets/exceptions.xml
	CatchArrayIndexOutOfBoundsException
	CatchError
	CatchException
	CatchIllegalMonitorStateException
	CatchIndexOutOfBoundsException
	CatchNullPointerException
	CatchRuntimeException
	CatchThrowable
	ConfusingClassNamedException
	ExceptionExtendsError
	ExceptionExtendsThrowable
	ExceptionNotThrown
	MissingNewInThrowStatement
	ReturnNullFromCatchBlock
	SwallowThreadDeath
	ThrowError
	ThrowException
	ThrowNullPointerException
	ThrowRuntimeException
	ThrowThrowable

	// rulesets/formatting.xml
	BracesForClass
	BracesForForLoop
	BracesForIfElse {
		validateElse = true
		elseOnSameLineAsClosingBrace = false
	}
	BracesForMethod
	BracesForTryCatchFinally
	ClassJavadoc
	ClosureStatementOnOpeningLineOfMultipleLineClosure
	FileEndsWithoutNewline
	LineLength {
		doNotApplyToFileNames = 'ModelBuilder.groovy'
		ignoreLineRegex = /\s*(throw.*|".*"|'.*')(\s\+)?/
	}
	MissingBlankLineAfterImports
	MissingBlankLineAfterPackage
	SpaceAfterCatch
	SpaceAfterClosingBrace
	SpaceAfterComma
	SpaceAfterFor
	SpaceAfterIf
	SpaceAfterOpeningBrace
	SpaceAfterSemicolon
	SpaceAfterSwitch
	SpaceAfterWhile
	SpaceAroundClosureArrow
	SpaceAroundMapEntryColon {
		characterAfterColonRegex = /\s/
	}
	SpaceAroundOperator
	SpaceBeforeClosingBrace
	SpaceBeforeOpeningBrace

	// rulesets/generic.xml
	IllegalClassMember
	IllegalClassReference
	IllegalPackageReference
	IllegalRegex
	IllegalString
	IllegalSubclass
	RequiredRegex
	RequiredString
	StatelessClass

	// rulesets/groovyism.xml
	AssignCollectionSort
	AssignCollectionUnique
	ClosureAsLastMethodParameter
	CollectAllIsDeprecated
	ConfusingMultipleReturns
	ExplicitArrayListInstantiation
	ExplicitCallToAndMethod
	ExplicitCallToCompareToMethod
	ExplicitCallToDivMethod
	ExplicitCallToEqualsMethod
	ExplicitCallToGetAtMethod
	ExplicitCallToLeftShiftMethod
	ExplicitCallToMinusMethod
	ExplicitCallToModMethod
	ExplicitCallToMultiplyMethod
	ExplicitCallToOrMethod
	ExplicitCallToPlusMethod
	ExplicitCallToPowerMethod
	ExplicitCallToRightShiftMethod
	ExplicitCallToXorMethod
	ExplicitHashMapInstantiation
	ExplicitHashSetInstantiation
	ExplicitLinkedHashMapInstantiation
	ExplicitLinkedListInstantiation
	ExplicitStackInstantiation
	ExplicitTreeSetInstantiation
	GStringAsMapKey
	GStringExpressionWithinString
	GetterMethodCouldBeProperty
	GroovyLangImmutable
	UseCollectMany
	UseCollectNested

	// rulesets/imports.xml
	DuplicateImport
	ImportFromSamePackage
	ImportFromSunPackages
	NoWildcardImports {
		ignoreStaticImports = true
	}
	UnnecessaryGroovyImport
	UnusedImport

	// rulesets/junit.xml
	ChainedTest
	CoupledTestCase
	SpockIgnoreRestUsed
	UnnecessaryFail
	UseAssertEqualsInsteadOfAssertTrue
	UseAssertFalseInsteadOfNegation
	UseAssertNullInsteadOfAssertEquals
	UseAssertSameInsteadOfAssertTrue
	UseAssertTrueInsteadOfAssertEquals
	UseAssertTrueInsteadOfNegation

	// rulesets/logging.xml
	LoggerForDifferentClass
	LoggerWithWrongModifiers
	LoggingSwallowsStacktrace
	MultipleLoggers
	PrintStackTrace
	Println
	SystemErrPrint
	SystemOutPrint

	// rulesets/naming.xml
	AbstractClassName
	ClassName
	ClassNameSameAsFilename
	ClassNameSameAsSuperclass
	ConfusingMethodName
	FactoryMethodName
	FieldName {
		ignoreFieldNames = 'logger'
	}
	InterfaceName
	InterfaceNameSameAsSuperInterface
	MethodName {
		ignoreMethodNames = '* *'
	}
	ObjectOverrideMisspelledMethodName
	PackageName
	PackageNameMatchesFilePath
	ParameterName
	PropertyName
	VariableName

	// rulesets/security.xml
	FileCreateTempFile
	InsecureRandom
	NonFinalPublicField
	NonFinalSubclassOfSensitiveInterface
	ObjectFinalize
	PublicFinalizeMethod
	SystemExit
	UnsafeArrayDeclaration

	// rulesets/serialization.xml
	EnumCustomSerializationIgnored
	SerialPersistentFields
	SerialVersionUID
	SerializableClassMustDefineSerialVersionUID

	// rulesets/size.xml
	//	AbcMetric   // Requires the GMetrics jar
	ClassSize
	//	CrapMetric   // Requires the GMetrics jar and a Cobertura coverage file
	//	CyclomaticComplexity   // Requires the GMetrics jar
	MethodCount
	MethodSize
	NestedBlockDepth
	ParameterCount {
		maxParameters = 8
	}

	// rulesets/unnecessary.xml
	AddEmptyString
	ConsecutiveLiteralAppends
	ConsecutiveStringConcatenation
	UnnecessaryBigDecimalInstantiation
	UnnecessaryBigIntegerInstantiation
	UnnecessaryBooleanExpression
	UnnecessaryBooleanInstantiation
	UnnecessaryCallForLastElement
	UnnecessaryCallToSubstring
	UnnecessaryCast
	UnnecessaryCatchBlock
	UnnecessaryCollectCall
	UnnecessaryCollectionCall
	UnnecessaryConstructor
	UnnecessaryDefInFieldDeclaration
	UnnecessaryDefInMethodDeclaration
	UnnecessaryDefInVariableDeclaration
	UnnecessaryDotClass
	UnnecessaryDoubleInstantiation
	UnnecessaryElseStatement
	UnnecessaryFinalOnPrivateMethod
	UnnecessaryFloatInstantiation
	UnnecessaryGString
	UnnecessaryGetter
	UnnecessaryIfStatement
	UnnecessaryInstanceOfCheck
	UnnecessaryInstantiationToGetClass
	UnnecessaryIntegerInstantiation
	UnnecessaryLongInstantiation
	UnnecessaryModOne
	UnnecessaryNullCheck
	UnnecessaryNullCheckBeforeInstanceOf
	UnnecessaryObjectReferences
	UnnecessaryOverridingMethod
	UnnecessaryPackageReference
	UnnecessaryParenthesesForMethodCallWithClosure
	UnnecessaryPublicModifier
	UnnecessarySafeNavigationOperator
	UnnecessarySelfAssignment
	UnnecessarySemicolon
	UnnecessaryStringInstantiation
	UnnecessaryTernaryExpression
	UnnecessaryToString
	UnnecessaryTransientModifier

	// rulesets/unused.xml
	UnusedArray
	UnusedMethodParameter
	UnusedObject
	UnusedPrivateField
	UnusedPrivateMethod
	UnusedPrivateMethodParameter
	UnusedVariable
}
