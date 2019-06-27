pipeline
{
        agent any
        stages
        {
            stage ('Compile Stage')
            {
            steps
            {
                withMaven (maven: 'maven_3_6_1')
                {
                    sh 'mvn clean compile'
                }
             }

            }

            stages
            {
                        stage ('Testing Stage')
                        {

                        steps
                        {
                            withMaven (maven: 'maven_3_6_1')
                            {
                                sh 'mvn clean compile'
                            }
                        }
                        }
             }

            stages
            {
                        stage ('Development Stage')
                        {
                        steps
                         {
                            withMaven (maven: 'maven_3_6_1')
                            {
                                sh 'mvn clean compile'
                            }
                          }
                        }

             }
        }
}