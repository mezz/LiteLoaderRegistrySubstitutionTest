This is a test mod for [LiteLoader issues with Forge Registry Replacement](http://develop.liteloader.com/liteloader/LiteLoader/issues/53).  
Its only function is to substitute the Anvil block using Forge's Registry replacement.

To get set up, run `gradle setupDecompWorkspace` and then `gradle genIntellijRuns` or the eclipse equivalent `gradle eclipse`.

Add the argument `--tweakClass com.mumfrey.liteloader.launch.LiteLoaderTweaker` to the run configuration to test with LiteLoader active.

When LiteLoader is active, you will see model errors and the anvil item is a missing model/texture. You will not be able to right click the anvil to open its gui.
