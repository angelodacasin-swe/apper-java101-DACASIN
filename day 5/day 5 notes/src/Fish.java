package zoo.itrface;
public class Fish {

    extends Animal implements NoLeg,

    ForWaterOnly {

        @Override
        public void swim () {

        }

        @Override
        public void dontWalk () {
        }

    }
}