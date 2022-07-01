import org.junit.Before
import org.junit.Test
import com.lesfurets.jenkins.unit.declarative.*

class TestExampleJenkinsfile extends DeclarativePipelineTest {
    @Override
    @Before
    void setUp() throws Exception {
        super.setUp()
    }

    @Test
    void imagerExamplePipeline() {
        //Arrange
        //Act
        runScript('groovy/example/Jenkinsfile')
        //Assert
        assertJobStatusSuccess()
    }
}