package lscript.parsing.nodes;

import lscript.lexing.Position;

import java.util.List;

/**
 * A simple Node representing a list (used for language lists).
 */
public class ListNode extends Node {

    private final List<Node> nodes;

    /**
     * @param nodes - a list of Nodes contained in the list.
     * @param posStart - The start position of the list.
     * @param posEnd - The end position of the list.
     */
    public ListNode(List<Node> nodes, Position posStart, Position posEnd) {
        super(posStart, posEnd);
        this.nodes = nodes;
    }

    /**
     * @return a List of Nodes contained in the list.
     */
    public List<Node> getNodes() {
        return nodes;
    }
}
