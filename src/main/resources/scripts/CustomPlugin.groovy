import org.yaml.snakeyaml.DumperOptions
import org.yaml.snakeyaml.Yaml

class CustomPlugin {
    def run(project) {
        println "Running custom plugin from ${project.basedir}"

        DumperOptions options = new DumperOptions();
        options.setIndent(2);
        options.setPrettyFlow(true);
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        def yamlOutput = new Yaml(options).dump([greeting: 'Hello neighbours!'])

        File resourcesDir = new File(project.build.directory + "/classes/custom-config.yml")
        resourcesDir << yamlOutput
        println "Saved output into ${resourcesDir.absolutePath}"
    }
}