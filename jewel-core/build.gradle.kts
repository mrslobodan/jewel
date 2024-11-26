plugins {
	id("buildsrc.convention.jewel.common-conventions")
	id("buildsrc.convention.jewel.distribution-conventions")
}

dependencies {
	implementation(project(":jewel-ui"))
	implementation(project(":jewel-os"))
	testImplementation(kotlin("test"))
}

application {
	mainClass.set("com.slobodanzivanovic.jewel.core.MainKt")
}
