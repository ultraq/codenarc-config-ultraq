
codenarc-config-ultraq
======================

CodeNarc config for all my Groovy projects.

Like other developers out there, I got tired of copy/pasting my CodeNarc
settings between projects - updating them for the current thing I'm working on,
forgetting to port them back to previous projects, etc - so it's about time I
created a shareable CodeNarc config so I can put this little annoyance to bed.

Currently adding on a project-by-project basis with the following code in a
project's `build.gradle` file:

```groovy
codenarc {
	def sharedConfig = 'https://raw.githubusercontent.com/ultraq/codenarc-config-ultraq/master/codenarc.groovy'.toURL().text
	config = resources.text.fromString(sharedConfig)
}
```

Am thinking of including it as part of the 1.5.0+ versions of my [gradle-support](https://github.com/ultraq/gradle-support)
configs.
