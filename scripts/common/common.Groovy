def example1() {
  println 'Hello from example1'
}

def example2() {
  println 'Hello from example2'
}

def getAwsCredential(xxx) {
    switch(xxx) {
        case "env1":
            return [
                    cluster: "eks-liferay-d1",
                    credential:"aws-credential-demo-1",
                    role: "arn:aws:iam::865657477340:role/aws-dev-eks-role",
                    region: "us-east-1"
            ];
        default:
            error("No credentials found for \"${xxx}\" environment.")
    }
}

return this
