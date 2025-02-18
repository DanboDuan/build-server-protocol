package ch.epfl.scala.bsp.testkit.gen

import org.scalacheck.Arbitrary
import Bsp4jGenerators._
import ch.epfl.scala.bsp4j
import ch.epfl.scala.bsp4j._

trait Bsp4jArbitrary {

  implicit val arbBspConnectionDetails: Arbitrary[BspConnectionDetails] = Arbitrary(
    genBspConnectionDetails
  )
  implicit val arbBuildClientCapabilities: Arbitrary[BuildClientCapabilities] = Arbitrary(
    genBuildClientCapabilities
  )
  implicit val arbBuildServerCapabilities: Arbitrary[BuildServerCapabilities] = Arbitrary(
    genBuildServerCapabilities
  )
  implicit val arbBuildTarget: Arbitrary[BuildTarget] = Arbitrary(genBuildTarget)
  implicit val arbBuildTargetCapabilities: Arbitrary[BuildTargetCapabilities] = Arbitrary(
    genBuildTargetCapabilities
  )
  implicit val arbBuildTargetEvent: Arbitrary[BuildTargetEvent] = Arbitrary(genBuildTargetEvent)
  implicit val arbBuildTargetEventKind: Arbitrary[BuildTargetEventKind] = Arbitrary(
    genBuildTargetEventKind
  )
  implicit val arbBuildTargetIdentifier: Arbitrary[BuildTargetIdentifier] = Arbitrary(
    genBuildTargetIdentifier
  )
  implicit val arbCleanCacheParams: Arbitrary[CleanCacheParams] = Arbitrary(genCleanCacheParams)
  implicit val arbCleanCacheResult: Arbitrary[CleanCacheResult] = Arbitrary(genCleanCacheResult)
  implicit val arbCompileParams: Arbitrary[CompileParams] = Arbitrary(genCompileParams)
  implicit val arbCompileProvider: Arbitrary[CompileProvider] = Arbitrary(genCompileProvider)
  implicit val arbCompileReport: Arbitrary[CompileReport] = Arbitrary(genCompileReport)
  implicit val arbCompileResult: Arbitrary[CompileResult] = Arbitrary(genCompileResult)
  implicit val arbCompileTask: Arbitrary[CompileTask] = Arbitrary(genCompileTask)
  implicit val arbDependencySourcesItem: Arbitrary[DependencySourcesItem] = Arbitrary(
    genDependencySourcesItem
  )
  implicit val arbDependencySourcesParams: Arbitrary[DependencySourcesParams] = Arbitrary(
    genDependencySourcesParams
  )
  implicit val arbDependencySourcesResult: Arbitrary[DependencySourcesResult] = Arbitrary(
    genDependencySourcesResult
  )
  implicit val arbDiagnostic: Arbitrary[Diagnostic] = Arbitrary(genDiagnostic)
  implicit val arbDiagnosticRelatedInformation: Arbitrary[DiagnosticRelatedInformation] = Arbitrary(
    genDiagnosticRelatedInformation
  )
  implicit val arbDiagnosticSeverity: Arbitrary[DiagnosticSeverity] = Arbitrary(
    genDiagnosticSeverity
  )
  implicit val arbDidChangeBuildTarget: Arbitrary[DidChangeBuildTarget] = Arbitrary(
    genDidChangeBuildTarget
  )
  implicit val arbInitializeBuildParams: Arbitrary[InitializeBuildParams] = Arbitrary(
    genInitializeBuildParams
  )
  implicit val arbInitializeBuildResult: Arbitrary[InitializeBuildResult] = Arbitrary(
    genInitializeBuildResult
  )
  implicit val arbInverseSourcesParams: Arbitrary[InverseSourcesParams] = Arbitrary(
    genInverseSourcesParams
  )
  implicit val arbInverseSourcesResult: Arbitrary[InverseSourcesResult] = Arbitrary(
    genInverseSourcesResult
  )
  implicit val arbLocation: Arbitrary[Location] = Arbitrary(genLocation)
  implicit val arbLogMessageParams: Arbitrary[LogMessageParams] = Arbitrary(genLogMessageParams)
  implicit val arbMessageType: Arbitrary[MessageType] = Arbitrary(genMessageType)
  implicit val arbPosition: Arbitrary[Position] = Arbitrary(genPosition)
  implicit val arbPublishDiagnosticsParams: Arbitrary[PublishDiagnosticsParams] = Arbitrary(
    genPublishDiagnosticsParams
  )
  implicit val arbRange: Arbitrary[bsp4j.Range] = Arbitrary(genRange)
  implicit val arbResourcesItem: Arbitrary[ResourcesItem] = Arbitrary(genResourcesItem)
  implicit val arbResourcesParams: Arbitrary[ResourcesParams] = Arbitrary(genResourcesParams)
  implicit val arbResourcesResult: Arbitrary[ResourcesResult] = Arbitrary(genResourcesResult)
  implicit val arbRunParams: Arbitrary[RunParams] = Arbitrary(genRunParams)
  implicit val arbRunProvider: Arbitrary[RunProvider] = Arbitrary(genRunProvider)
  implicit val arbRunResult: Arbitrary[RunResult] = Arbitrary(genRunResult)
  implicit val arbJvmBuildTarget: Arbitrary[JvmBuildTarget] = Arbitrary(genJvmBuildTarget)
  implicit val arbSbtBuildTarget: Arbitrary[SbtBuildTarget] = Arbitrary(genSbtBuildTarget)
  implicit val arbScalaBuildTarget: Arbitrary[ScalaBuildTarget] = Arbitrary(genScalaBuildTarget)
  implicit val arbScalacOptionsItem: Arbitrary[ScalacOptionsItem] = Arbitrary(genScalacOptionsItem)
  implicit val arbScalacOptionsParams: Arbitrary[ScalacOptionsParams] = Arbitrary(
    genScalacOptionsParams
  )
  implicit val arbScalacOptionsResult: Arbitrary[ScalacOptionsResult] = Arbitrary(
    genScalacOptionsResult
  )
  implicit val arbScalaMainClass: Arbitrary[ScalaMainClass] = Arbitrary(genScalaMainClass)
  implicit val arbScalaMainClassesItem: Arbitrary[ScalaMainClassesItem] = Arbitrary(
    genScalaMainClassesItem
  )
  implicit val arbScalaMainClassesParams: Arbitrary[ScalaMainClassesParams] = Arbitrary(
    genScalaMainClassesParams
  )
  implicit val arbScalaMainClassesResult: Arbitrary[ScalaMainClassesResult] = Arbitrary(
    genScalaMainClassesResult
  )
  implicit val arbScalaPlatform: Arbitrary[ScalaPlatform] = Arbitrary(genScalaPlatform)
  implicit val arbScalaTestClassesItem: Arbitrary[ScalaTestClassesItem] = Arbitrary(
    genScalaTestClassesItem
  )
  implicit val arbScalaTestClassesParams: Arbitrary[ScalaTestClassesParams] = Arbitrary(
    genScalaTestClassesParams
  )
  implicit val arbScalaTestClassesResult: Arbitrary[ScalaTestClassesResult] = Arbitrary(
    genScalaTestClassesResult
  )
  implicit val arbScalaTestParams: Arbitrary[ScalaTestParams] = Arbitrary(genScalaTestParams)
  implicit val arbShowMessageParams: Arbitrary[ShowMessageParams] = Arbitrary(genShowMessageParams)
  implicit val arbSourceItem: Arbitrary[SourceItem] = Arbitrary(genSourceItem)
  implicit val arbSourceItemKind: Arbitrary[SourceItemKind] = Arbitrary(genSourceItemKind)
  implicit val arbSourcesItem: Arbitrary[SourcesItem] = Arbitrary(genSourcesItem)
  implicit val arbSourcesParams: Arbitrary[SourcesParams] = Arbitrary(genSourcesParams)
  implicit val arbSourcesResult: Arbitrary[SourcesResult] = Arbitrary(genSourcesResult)
  implicit val arbStatusCode: Arbitrary[StatusCode] = Arbitrary(genStatusCode)
  implicit val arbTaskFinishParams: Arbitrary[TaskFinishParams] = Arbitrary(genTaskFinishParams)
  implicit val arbTaskId: Arbitrary[TaskId] = Arbitrary(genTaskId)
  implicit val arbTaskProgressParams: Arbitrary[TaskProgressParams] = Arbitrary(
    genTaskProgressParams
  )
  implicit val arbTaskStartParams: Arbitrary[TaskStartParams] = Arbitrary(genTaskStartParams)
  implicit val arbTestFinish: Arbitrary[TestFinish] = Arbitrary(genTestFinish)
  implicit val arbTestParams: Arbitrary[TestParams] = Arbitrary(genTestParams)
  implicit val arbTestProvider: Arbitrary[TestProvider] = Arbitrary(genTestProvider)
  implicit val arbTestReport: Arbitrary[TestReport] = Arbitrary(genTestReport)
  implicit val arbTestResult: Arbitrary[TestResult] = Arbitrary(genTestResult)
  implicit val arbTestStart: Arbitrary[TestStart] = Arbitrary(genTestStart)
  implicit val arbTestStatus: Arbitrary[TestStatus] = Arbitrary(genTestStatus)
  implicit val arbTestTask: Arbitrary[TestTask] = Arbitrary(genTestTask)
  implicit val arbTextDocumentIdentifier: Arbitrary[TextDocumentIdentifier] = Arbitrary(
    genTextDocumentIdentifier
  )
  implicit val arbWorkspaceBuildTargetsResult: Arbitrary[WorkspaceBuildTargetsResult] = Arbitrary(
    genWorkspaceBuildTargetsResult
  )
  implicit val arbJvmEnvironmentItem: Arbitrary[JvmEnvironmentItem] = Arbitrary(
    genJvmEnvironmentItem
  )
  implicit val arbTestJvmEnvironmentParams: Arbitrary[JvmTestEnvironmentParams] = Arbitrary(
    genJvmTestEnvironmentParams
  )
  implicit val arbTestJvmEnvironmentResult: Arbitrary[JvmTestEnvironmentResult] = Arbitrary(
    genJvmTestEnvironmentResult
  )
  implicit val arbRunJvmEnvironmentParams: Arbitrary[JvmRunEnvironmentParams] = Arbitrary(
    genJvmRunEnvironmentParams
  )
  implicit val arbRunJvmEnvironmentResult: Arbitrary[JvmRunEnvironmentResult] = Arbitrary(
    genJvmRunEnvironmentResult
  )
  implicit val arbJavacOptionsItem: Arbitrary[JavacOptionsItem] = Arbitrary(genJavacOptionsItem)
  implicit val arbJavacOptionsParams: Arbitrary[JavacOptionsParams] = Arbitrary(
    genJavacOptionsParams
  )
  implicit val arbJavacOptionsResult: Arbitrary[JavacOptionsResult] = Arbitrary(
    genJavacOptionsResult
  )
  implicit val arbCppBuildTarget: Arbitrary[CppBuildTarget] = Arbitrary(genCppBuildTarget)
  implicit val arbCppOptionsItem: Arbitrary[CppOptionsItem] = Arbitrary(genCppOptionsItem)
  implicit val arbCppOptionsParams: Arbitrary[CppOptionsParams] = Arbitrary(genCppOptionsParams)
  implicit val arbCppOptionsResult: Arbitrary[CppOptionsResult] = Arbitrary(genCppOptionsResult)
  implicit val arbPythonBuildTarget: Arbitrary[PythonBuildTarget] = Arbitrary(genPythonBuildTarget)
  implicit val arbPythonOptionsItem: Arbitrary[PythonOptionsItem] = Arbitrary(genPythonOptionsItem)
  implicit val arbPythonOptionsParams: Arbitrary[PythonOptionsParams] = Arbitrary(
    genPythonOptionsParams
  )
  implicit val arbPythonOptionsResult: Arbitrary[PythonOptionsResult] = Arbitrary(
    genPythonOptionsResult
  )
}

object Bsp4jArbitrary extends Bsp4jArbitrary
