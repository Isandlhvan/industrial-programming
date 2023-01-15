//
// Created by yegor on 15.1.23.
//

#ifndef ABSTRACT_FACTORY_MAZE_H
#define ABSTRACT_FACTORY_MAZE_H


class Maze {
    class MazeFactory {
    public:
        MazeFactory();
        virtual Maze* MakeMaze() const;
        virtual Wall* MakeWall() const;
        virtual Room* MakeRoom(int n) const;
        virtual Door* MakeDoor(Room* r1, Room* r2) const;
    };
};


#endif //ABSTRACT_FACTORY_MAZE_H
