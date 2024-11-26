plugins {
	id("buildsrc.convention.jewel.common-conventions")
	application
}

application {
	mainClass = "com.slobodanzivanovic.jewel.core.Main"
}

dependencies {
	testImplementation(kotlin("test"))
}
